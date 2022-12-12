package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNo {
	public static void main(String[] args) {
		 int[] no= {4,3,6,8,29,1,2,4,7,8};
		   Set<Integer> Numset=new HashSet<Integer>();
		   Set<Integer> DupNumset=new HashSet<Integer>();
			for(int i=0; i<no.length ; i++) {
				Boolean Check=Numset.add(no[i]);
				if(!Check) {
					DupNumset.add(no[i]);}}
				System.out.println("Duplicate no's==" + DupNumset);
	}

}
