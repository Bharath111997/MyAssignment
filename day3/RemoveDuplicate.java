package week5.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1 ";
		String[] split=text.split("\\s+");//for many white spaces
		//String name03=text.replaceAll("java","");
		Set<String> name=new LinkedHashSet<String>();
		for(int j=0;j<split.length;j++) {
			name.add(split[j]);
		}System.out.println(name);
		
	}

}
