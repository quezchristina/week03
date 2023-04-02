package week04codingassignmenthw;

import java.util.Arrays;

public class week03arraysandmethodsassignment {

	public static void main(String[] args) {
// TODO Auto-generated method stub
/* 
 * 1. Create an array of int called ages that contains the following 
 * values: 3, 9, 23, 64, 2, 8, 28, 93.
 */
int[] agesArray = {3,9,23,64,2,8,28,93};
/*
 *  a. Programmatically subtract the value of the first element in the array 
*  from the value in the last element of the array (i.e. do not use ages[7] 
*  in your code). Print the result to the console. 
 */
		
System.out.println("Last element minus first:" + (agesArray[agesArray.length-1]- agesArray[0]));

/*
 *1b. Add a new age to your array and repeat the step above to ensure it is
 *  dynamic (works for arrays of different lengths).
 */
int[] newArray = {3,9,26,27,2,28};
System.out.println("Last element minus first:" + (newArray[newArray.length - 1] - newArray[0]));
		
/* 
 * 1c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
 */	
		int averageAge = 0;
		for (int age : agesArray) {
			averageAge += age;
		}
		System.out.println(averageAge/agesArray.length);
		
// QUESTION 2
/*
* Create an array of String called names that contains the following values: 
 * “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
 */
String[] nNames = {"Sam", "Tommy", "Tim","Sally", "Buck", "Bob"};
int averageOfLetters = 0;
for (String names : nNames) {
	averageOfLetters += nNames.length;
}
System.out.println(averageOfLetters);
/* 
 * Use a loop to iterate through the array and calculate the average number of 
 * letters per name. Print the result to the console.(see above)
 */ 

//concatenate all names together 
String[] rNames = {"Sam", "Tommy", "Tim", "Sally","Buck", "Bob"};
for (String name: rNames) {
	System.out.print(name + "," + " ");
}
System.out.println();

/* 
 * 3. How do you access the last element of any array?
 */
System.out.println(rNames[rNames.length-1]);

/* 
 * 4. How do you access the first element of any array? 
 */

System.out.println(rNames[0]);

/*
 * 5. Create a new array of int called nameLengths. Write a loop to iterate over the
 *  previously created names array and add the length of each name to the nameLengths array.
 */
int[] namesLengths = new int[6];
int l = 0;
for (int i = 0; i < namesLengths.length;i++) {
	namesLengths[i] = rNames[i].length();
}
System.out.println(Arrays.toString(namesLengths));

/*
 * 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the 
 * elements in the array. Print the result to the console.
 */
int sumOfNamesLengths = 0;
for (int i = 0; i < namesLengths.length; i++) {
	sumOfNamesLengths += namesLengths[i];
}
System.out.println("The sum of all the letters in the new array:" + sumOfNamesLengths);

/*
 * 7. Write a method that takes a String, word, and an int, n, as arguments and 
 * returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
 */
System.out.println(duplicateValues("Hello", 3));

/*
 * 8. Write a method that takes two Strings, firstName and lastName,
 *  and returns a full name (the full name should be the first and the
 *   last name as a String separated by a space).
 */
System.out.println(fullName("Bob", "Smith"));

/*
 * 9. Write a method that takes an array of int and returns true if the sum of all the ints 
 * in the array is greater than 100.
 */
System.out.println(sumOfInts(agesArray));

/*
 * 10. Write a method that takes an array of double and returns the average of all the
 *  elements in the array.	
 */
double [] numbers1 = {1.1,2.7, 3.5, 4.30, 4.07};
System.out.println(averageOfElements(numbers1));

/*
 * 11. Write a method that takes two arrays of double and returns true if the average
 *  of the elements in the first array is greater than the average of the elements in the
 *   second array.
*/
double [] numbers2 = {3.3,5.6,8.7,2.7};
System.out.println(averageOfElements2(numbers1, numbers2));


/*
 * 12. Write a method called willBuyDrink that takes a boolean isHotOutside,
 * and a double moneyInPocket, and returns true if it is hot outside and if 
 * moneyInPocket is greater than 10.50.
 */
System.out.println(willBuyDrink(false,22));

/* 
 * 13. Create a method of your own that solves a problem. In comments, 
 * write what the method does and why you created it.
 * answer: creating a hair appointment if there are more than 30 people in the salon. They 
 * can not take no one. If there less they can
 */
System.out.println(hairAppointment(2));

	}
	//METHODS 
	//Question 7
	public static String duplicateValues(String word, int n) {
		String answer = "";
		for (int i = 0; i<n; i++) {
			answer += word;
		}
		return answer;
	}
	//QUESTION 8
	public static String fullName (String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	//Question 9 
	public static boolean sumOfInts(int[] numbers) {
		int answer = 0;
		for (int i =0; i < numbers.length; i++) {
			answer = answer + numbers[i];
		} if (answer > 100) {
			return true;
		} else {
			return false;
		} }
	
	//Question 10
	public static double averageOfElements(double [] arr) {
		return sumOfElements(arr)/arr.length;
	}
	public static double sumOfElements(double[] numbers) {
		double sum = 0;
		for (double num : numbers) {
			sum += num;
		}
		return sum;
	}
	//Question 11
	public static boolean averageOfElements2(double [] arr1, double [] arr2) {
		double sum = 0;
		double sum2 = 0;
		double average1 = 0;
		double average2 = 0;
		for(double num : arr1) {
			sum += num;
			average1 = sum / arr1.length;
		}for (double num : arr2) {
			sum2 += num;
			average2 = sum/arr2.length;
		} if (average1 > average2) {
			return true;
		} else {
			return false;
		}
	}
	//Question 12
public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
	if (isHotOutside && moneyInPocket > 10.50) {
		return true;
	} else {
		return false;
	}
}
//Question 13: Hair appointment availability 
//want to find out if there available slots
public static String hairAppointment (int status) {
	if (status > 30) {
		return "We are full, please reschedule for another day.";
	} else {
		return "Welcome, what time would you like to come in?";
	}
}

}
