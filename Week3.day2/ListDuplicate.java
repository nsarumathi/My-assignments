package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDuplicate {
	public static void main(String[] args) {
	String[] Name= {"Adam","Ben", "Zara", "Adam", "Charlie", "James", "Ben"};
	List<String> Check =new ArrayList<String>(Arrays.asList(Name));
	List<String> Duplicate =new ArrayList<String>();
	System.out.println(Check);
	int Count=Collections.frequency(Check,"Adam");
	System.out.println("Adam's Count="+Count);
	System.out.println("Ben's Count="+ Collections.frequency(Check,"Ben"));
	for(int i=0;i<Name.length;i++) {
		for(int j=i+1;j<Name.length;j++) {
			if(Check.get(i)==Check.get(j)) {
			System.out.println("Duplicate are=="+ Check.get(i));
			Duplicate.add(Check.get(i));
			}}}
	System.out.println("Duplicate ="+ Duplicate);
	Check.removeAll(Duplicate);
	System.out.println("Name list after removal= "+Check);
}
}
