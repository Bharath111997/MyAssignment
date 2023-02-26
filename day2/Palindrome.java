package week5.day2;

public class Palindrome {
	public static void main(String[] args) {
		//Declare the input
	
	String text="madam";
	//Declare the empty string
	String rev="";
	//Convert the String into Character
	char[] charArray=text.toCharArray();
	//Iterate the character using rverse for loop
	for(int i=charArray.length-1; i>=0; i--) {
		//Store the reverse char in rev
		rev=rev+charArray[i];
		
	}
	//Compare text and rev using if else condition
	if(text.equals(rev)) {
		System.out.println("Given string is Palindrome");
	}
	else {
		System.out.println("Given string is not a Palindrome");
	}

}
}
