package week03;

import java.lang.reflect.Array;

public class Week03ArraysAndMethodslab {

public static void main(String[] args) {
		
		// TODO Auto-generated method stub
					
				//
				// Arrays:
				//
				
	// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
int[] arrayOfValues = new int[6];
arrayOfValues[0] = 1;
arrayOfValues[1] = 5;
arrayOfValues[2] = 2;
arrayOfValues[3] = 8;
arrayOfValues[4] = - 3;
arrayOfValues[5] = 6;
/*
 *  or the shorter version 
 *  int[] arrayOfValues = {1, 5, 2, 8, 13, 6};
 */


// 2. Print out the first element in the array
			System.out.println(arrayOfValues[0]);
				
// 3. Print out the last element in the array without using the number 5
				System.out.println(arrayOfValues[arrayOfValues.length - 1]);
				
// 4. Print out the element in the array at position 6, what happens?
				// System.out.println(arrayOfValues[6]);
				
// 5. Print out the element in the array at position -1, what happens?
				//System.out.println(arrayOfValues[-1]);


// 6. Write a traditional for loop that prints out each element in the array
	for (int i = 0; i < arrayOfValues.length; i++) {
		System.out.println(arrayOfValues[i]);
	}
					
// 7. Write an enhanced for loop that prints out each element in the array
for (int value : arrayOfValues) {
	System.out.println(value);
}
				
// 8. Create a new variable called sum, write a loop that adds 
//			each element in the array to the sum
double sum = 0; 
for (int value : arrayOfValues ) {
	sum += value;
}
System.out.println(sum);

					
// 9. Create a new variable called average and assign the average value of the array to it
double average = sum / arrayOfValues.length;
System.out.println(average);
				
// 10. Write an enhanced for loop that prints out each number in the array 
				//			only if the number is odd
 for (int value : arrayOfValues) {
	 if (value % 2 != 0 ) {
		 System.out.println(value);
	 }
 }
				
// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
String[] names = new String[4];
names[0] = "Sam";
names[1] = "Sally";
names[2] = "Thomas";
names[3] = "Robert";

/* 
 * Or you can do this:
 * String[] names = {"Sam", "SALLY", "Thomas", "Robert"};
 */

				
// 12. Calculate the sum of all the letters in the new array
int sumOfNames = 0;
for (String name : names ) {
	sumOfNames += names.length;
}
				

//
// Methods:
//
				
// 13. Write and test a method that takes a String name and prints out a greeting. 
//			This method returns nothing.
		greet("Tom");
		greet("Christina");
		
				
// 14. Write and test a method that takes a String name and  
//			returns a greeting.  Do not print in the method.
		String greeting = (greet2("Christina"));
		System.out.println(greeting);
				
// Compare method 13 and method 14:  
//		a. Analyze the difference between these two methods.
//		b. What do you find? 
//		c. How are they different?
			/*
			 * 	first one, just prints does NOT return anything cant store the value (it gives 
			 * an error)
			 * 2nd one gets return
			 * 	you can access the value outside of the method itself
			 */
				
// 15. Write and test a method that takes a String and an int and 
//			returns true if the number of letters in the string is greater than the int
			System.out.println(isStringLongerThanNumber("Hello", 3));
				
// 16. Write and test a method that takes an array of string and a string and 
//			returns true if the string passed in exists in the array
		// System.out.println(arrayContainString(names + "Hello"));	
				
// 17. Write and test a method that takes an array of int and 
//			returns the smallest number in the array
			System.out.println(findSmallestNumber(arrayOfValues));
				
			// 18. Write and test a method that takes an array of double and 
//			returns the average
			double[] doubles = { 45.7, 30.2, 67.2};
			System.out.println(calculateAverage(doubles));
			
			
	// 19. Write and test a method that takes an array of Strings and 
//			returns an array of int where each element
//			matches the length of the string at that position
	
int[] nameLengths = extractStringLengths(names);
for (int number : nameLengths) {
	System.out.println(number);
}
	
	
	
// 20. Write and test a method that takes an array of strings and 
//			returns true if the sum of letters for all strings with an even amount of letters
//			is greater than the sum of those with an odd amount of letters.
System.out.println(hasMoreEvenCharacters(names));

			
// 21. Write and test a method that takes a string and 
//			returns true if the string is a palindrome (word or sentence that reads the same both forward and backwards)
System.out.println(isPalindrome("wow"));
	}
	



// 
				
				

			

			
// Method 13:13. Write and test a method that takes a String name and prints out a greeting.
	public static void greet (String name) {
		System.out.println("Hello, " + name + "");
	}
		

			// Method 14:
public static String greet2 (String name) {
	return "Hi, " + name + "";
}
			
			// Method 15:
public static boolean isStringLongerThanNumber (String string, int number) {
	return string.length() > number;
		
	} 
			
			// Method 16:
public static boolean doesArrayContainString(String[] array, String string) {
	for (String str : array ) {
		if (str.equals(string)) {
			return true;
		}
	}
	return false;
}



			
			// Method 17:
public static int findSmallestNumber(int[] numbers) {
	int smallest = numbers [0];
	for (int number : numbers) {
		if (number < smallest) {
			smallest = number;
		}
	}
	return smallest;

} 

			
			// Method 18:
public static double calculateAverage(double[] array) {
	double sum = 0;
	for (double number : array ) {
		sum += number;
	}
	return sum / array.length;
}


			// Method 19:

public static int[] extractStringLengths(String[] strings) {
	int[] results = new int[strings.length];
	for (int i = 0; i < strings.length; i++) {
		results[i] = strings[i].length();
	} 
	return results;
}


			
	// Method 20:
	public static boolean hasMoreEvenCharacters(String[] array) {
		int evenLetters = 0;
		int oddLetters = 0;
		
		for (String string : array) {
			if (string.length() % 2 ==0 ) {
				evenLetters += string.length();
			} else {
				oddLetters += string.length();
			}
		}
		 return evenLetters > oddLetters;
	}
			
// Method 21:Write and test a method that takes a string and returns true if the string 
// is a palindrome (word or sentence that reads the same both forward and backwards)
	public static boolean isPalindrome(String string) {
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				return false;
				
			
			}
		}
		
		return true;
	}

		


}
