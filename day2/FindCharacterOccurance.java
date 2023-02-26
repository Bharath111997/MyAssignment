package week5.day2;

public class FindCharacterOccurance {
	public static void main(String[] args) {
		//Declare the String 'a'
		String a ="Testleaf";
		//Using toCharArray 
		char[] name=a.toCharArray();
		//Declare 'count' = 0
		int count=0;
		//Iterate the value using for loop
		for(int i=0;i<name.length;i++) {
			//Using if condition
			if(name[i]=='e')
				count++;
					}
		//Print the value
		System.out.println("e occurance is "+count);
	}

}
