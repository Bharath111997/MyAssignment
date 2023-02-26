package week5.day2;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		//Using Scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String val=scan.nextLine();
		//Declare a String
		String name="Bharath";
		//Convert the string into character
		char[] reverse = name.toCharArray();
		//Iterate the character using reverse for loop
		for(int i=reverse.length-1; i>=0; i--) {
			System.out.println(reverse[i]);
		}
	}

}
