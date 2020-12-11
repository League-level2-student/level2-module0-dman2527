package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		  String[] array1 = {"sheesh","sheeesh","sheeeesh","sheeeeesh","sheeeeeesh"};
		//2. print the third element in the array
		System.out.println(array1[3]);
		//3. set the third element to a different value
		array1[3] = "ya dig";
		//4. print the third element again
		System.out.println(array1[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		//6. make an array of 50 integers
		int[] array50 = new int[50]  ;
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < array50.length; i++) {
			Random random = new Random();
			array50[i] = random.nextInt(10000);
		}
		
		//8. without printing the entire array, print only the smallest number in the array
		int smallestnumber = 1000000 ;
		for (int i = 0; i < array50.length; i++) {
			if(smallestnumber >= array50[i]) {
				smallestnumber = array50[i];
			}
		}
		System.out.println(smallestnumber + "smallest <--");
		
		//9 print the entire array to see if step 8 was correct
		for (int j = 0; j < array50.length; j++) {
			System.out.println(array50[j]);
		}
		//10. print the largest number in the array.
		
	}
}
