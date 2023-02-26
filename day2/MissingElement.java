package week5.day2;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		//Declare Array 'a'
		int[] number= {2,5,6,8,9,1,3,4};
		//Arrange the values in ascending order using Arrays.sort() method
		Arrays.sort(number);
		//Store the Array length as 'n'
		int n=number.length+1;
		//Find the missing element using maths formula
		int sum=n*(n+1)/2;
		//Iterate the Array using for loop
		for(int i=0; i<number.length; i++) {
			//Subtract the value and find the missing element
			sum=sum-number[i];
		}
		//print the Missing element
		System.out.println("Missing Element is "+sum);
	}

}
