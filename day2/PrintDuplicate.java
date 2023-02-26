package week5.day2;

import java.util.Arrays;

public class PrintDuplicate {
	public static void main(String[] args) {
		//Declare a Array 'a'
		int[] a= {11,22,33,44,55,66,22,77,11};
		//Arrange the values in ascending order using Arrays.sort() method
		Arrays.sort(a);
		//Iterate the values using for loop
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				//To compare a[i] and j[i] using if condition
				if(a[i]==a[j]) {
					System.out.println("Duplicate number is "+a[i]);
				}
			}
		}
	}

}
