package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
   String Text="PayPal India";
   char[] A=Text.toCharArray();
   Set<Character> Charset=new HashSet<Character>();
   Set<Character> Dupcharset=new HashSet<Character>();
	for(int i=0; i<A.length ; i++) {
		Boolean Check=Charset.add(A[i]);
		if(!Check) {
			Dupcharset.add(A[i]);
			}}
	System.out.println("unique Characters="+ Charset);
	System.out.println("Duplicate Characters=" +Dupcharset);
	Charset.removeAll(Dupcharset);
	System.out.println("unique Characters without Duplicate=="+ Charset);
	System.out.println("Size of Characters==" +Charset.size());
	 List<Character> Check =new ArrayList<Character>(Charset);
	 int C=Collections.frequency(Charset, " ");
	 System.out.println("index of space location=="+ C);
	 Check.remove(C);
     System.out.println("unique Characters without empty space=="+Check);
	}
}
