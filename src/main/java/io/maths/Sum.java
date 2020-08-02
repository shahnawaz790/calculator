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
	
	// accept delimeter in first line if provided by user
	public int addMultipleDelimeter(String n) throws IllegalArgumentException {
		int result = 0;
		boolean delimeterFound = false;
		String[] numbers;
		String delimeter = ",";
		if(n == null || n.length() == 0) {
			return result;
		}
		numbers = n.split("\n");
		if(numbers.length > 1 && numbers[0].contains("//")) {
			delimeter = numbers[0].replace("//", "");
			delimeterFound = true;
			n = numbers[1];
		}
		
		if(!delimeterFound) {
			n = n.replace("\n", delimeter);
		}
		
		
		// splitting string into array
		numbers = n.split(delimeter);
		
		// calculate sum of numbers
		for(int i=0; i < numbers.length ; i++) {
			if(numbers[i] == null || numbers[i].length() == 0) {
				throw new IllegalArgumentException("Provided invalid string");
			}
			
			result += Integer.parseInt(numbers[i]);
		}
		
		return result;
	}
	
	public int addNegativeWithRangeValidation(String n) throws IllegalArgumentException {
		int result = 0;
		int number;
		boolean delimeterFound = false;
		String[] numbers;
		String delimeter = ",";
		if(n == null || n.length() == 0) {
			return result;
		}
		numbers = n.split("\n");
		if(numbers.length > 1 && numbers[0].contains("//")) {
			delimeter = numbers[0].replace("//", "");
			delimeterFound = true;
			n = numbers[1];
		}
		if(!delimeterFound) {
			n = n.replace("\n", delimeter);
		}
		
		
		// splitting string into array
		numbers = n.split(delimeter);
		
		// calculate sum of numbers
		for(int i=0; i < numbers.length ; i++) {
			number = Integer.parseInt(numbers[i]);
			if(numbers == null || number < 0) {
				throw new IllegalArgumentException("Provided invalid string or negative number");
			}
			
			if(number > 1000) { // ignore if number is greater than 1000
				number = 0;
			}
			
			result += number;
		}
		return result;
	}
	
	
}
