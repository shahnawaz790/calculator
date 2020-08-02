package io.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumTest {
	
private Sum sum;
	
	@BeforeEach
	void initEach() {
		sum = new Sum();
	}
	
	@Test
	void testPassingEmptyString() {
		assertEquals(0, sum.add(""), 
				"Add method should return 0 when blank string is pass");
	}
	
	@Test 
	void testPassingOneValue(){
		assertThrows(IllegalArgumentException.class, () -> sum.add("1"), 
				"Only two comma separated number is acceptable");
	}
	
	@Test
	void testPassingTwoValues() {
		assertEquals(5, sum.add("3,2"),
				"Sum of of values should be two");
	}
	
	@Test
	void testPassingManyValues() {
		assertEquals(6, sum.addManyNumbers("3,2,1"),
				"Sum of of values should be six");
	}
	
	@Test
	void testPassingValueInNewLine() {
		assertEquals(6, sum.addNewLineDelimeter("1\n2,3"),
				"Sum of of values should be six");
	}
}
