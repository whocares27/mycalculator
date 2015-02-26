import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {

	@Test
	public void testNfactorial() {
		MyCalculator bc = new MyCalculator();//instantiate
		
		assertEquals("Error in nfactorial(0)",1,bc.nfactorial(0));
		
		assertEquals("Error in nfactorial(1)",2,bc.nfactorial(1));//error
		
		assertEquals("Error in nfactorial(-3)",1,bc.nfactorial(-3));
		
		assertEquals("Error in nfactorial(5)",24,bc.nfactorial(5));
		
		assertEquals("Error in nfactorial(10)",362880,bc.nfactorial(10));

	}

	@Test
	public void testBinarySearch() {
		MyCalculator bc = new MyCalculator();//instantiate
		int[] numbers = {1,3,4,7,8,12,17,21,28,30};//create array
		int[] empty = {};//empty array
		//test all paths
		assertEquals(-1,bc.binarySearch(empty, 15));
		
		assertEquals(-1,bc.binarySearch(numbers, 15));
		
		assertEquals(4,bc.binarySearch(numbers, 8));
		
		assertEquals(2,bc.binarySearch(numbers, 4));
		
		assertEquals(9,bc.binarySearch(numbers, 30));
		
	}

}
