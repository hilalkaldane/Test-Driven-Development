package com.hk97.incubyte.tdd;

/**
 * @author Hilal Kaldane
 */
public class Main {
	/**
	 *This method returns addition of given numbers
	 * @param numbers input numbers for addition
	 * @return addition of numbers
	 */
	public static int add(String numbers) {

		int returnValue = 0;
		//checks for value in input
		if (numbers.trim().isEmpty()) {
			return returnValue;
		}
		else {
			String[] numbersArray;
			if (numbers.startsWith("//")) {
				//splits numbers based on delimeter provided
				numbersArray = numbers.split("\\n")[1].split(String.valueOf(numbers.charAt(2)));
			}
			else {
				//splits input by delimeter as , and \n
				numbersArray = numbers.split(",|\\n");
			}
			for (String s : numbersArray) {
				//adds sum of the numbers to returnValue
				returnValue += Integer.parseInt(s);
			}
		}
		return returnValue;
	}
}
