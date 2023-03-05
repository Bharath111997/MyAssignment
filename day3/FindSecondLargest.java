package week5.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> name=new TreeSet<Integer>();
		for(int i=0;i<data.length;i++) {
			name.add(data[i]);
			
		}
		List<Integer> name2=new ArrayList<Integer>(name);
		System.out.println(name2);
		int size=name2.size();		
		System.out.println(name2.get(size-2));
	}

}
