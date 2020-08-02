package io.maths;

public class Sum {
	public int add(String n) throws IllegalArgumentException {
		int result = 0;
		if(n == null || n.length() == 0) {
			return result;
		}
		
		// splitting string into array
		String[] numbers = n.split(",");
		
		//throws execption if number of argument is not 2.
		if(numbers.length != 2) {
			throw new IllegalArgumentException("Number of comma separated value should be 2");
		}
		
		// calculate sum of numbers
		for(int i=0; i < numbers.length ; i++) {
			if(numbers[i] == null || numbers[i].length() == 0) {
				throw new IllegalArgumentException("Provided invalid string");
			}
			result += Integer.parseInt(numbers[i]);
		}
		
		return result;
	}
	
	public int addManyNumbers(String n) throws IllegalArgumentException {
		int result = 0;
		if(n == null || n.length() == 0) {
			return result;
		}
		
		// splitting string into array
		String[] numbers = n.split(",");
		
		// calculate sum of numbers
		for(int i=0; i < numbers.length ; i++) {
			
			if(numbers[i] == null || numbers[i].length() == 0) {
				throw new IllegalArgumentException("Provided invalid string");
			}
			
			result += Integer.parseInt(numbers[i]);
		}
		
		return result;
	}
	
	public int addNewLineDelimeter(String n) throws IllegalArgumentException {
		int result = 0;
		if(n == null || n.length() == 0) {
			return result;
		}
		
		
		
		// convert all new line to comma
		n = n.replace("\n", ",");
		
		// splitting string into array
		String[] numbers = n.split(",");
		
		// calculate sum of numbers
		for(int i=0; i < numbers.length ; i++) {
			if(numbers[i] == null || numbers[i].length() == 0) {
				throw new IllegalArgumentException("Provided invalid string");
			}
			
			result += Integer.parseInt(numbers[i]);
		}
		
		return result;
	}
	
	
}
