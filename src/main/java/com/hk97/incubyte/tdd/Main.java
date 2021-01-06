package com.hk97.incubyte.tdd;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hilal Kaldane
 */
public class Main {
	/**
	 *This method returns addition of given numbers
	 * @param numbers input numbers for addition
	 * @return addition of numbers
	 */
	public int add(String numbers) {

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
			for (String number : numbersArray) {
				//adds sum of the numbers to returnValue
				if (isNegative(Integer.parseInt(number))) {
					try {
						throw new NegativeNumberException(numbersArray);
					}
					catch (NegativeNumberException e) {
						System.out.print("negatives not allowed ");
						for (String negativeNumber : e.negativeNumbersArray) {
							System.out.print(negativeNumber +" ");
						}
						System.out.println();
						return 0;
					}
				}
				if (Integer.parseInt(number) <= 1000) {
					returnValue += Integer.parseInt(number);
				}
			}
		}
		return returnValue;
	}

	static boolean isNegative(int number) {
		return number < 0;
	}

	class NegativeNumberException extends Exception {
		List<String> negativeNumbersArray;

		NegativeNumberException(String[] numbersArray) {
			negativeNumbersArray = new ArrayList<>();
			for (String s : numbersArray) {
				if (isNegative(Integer.parseInt(s)))
					negativeNumbersArray.add(s);
			}
		}
	}
}
