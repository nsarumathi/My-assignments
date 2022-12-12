package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintuniqueChar {
	public static void main(String[] args) {
		String Name="Sarumathi N";
		char[] A=Name.toCharArray();
		Set<Character> Charac=new HashSet<Character>();
		for(int i=0;i< A.length ;i++) {
			Boolean check=Charac.add(A[i]);
			if(!check) {Charac.remove(A[i]);}
		}
   System.out.println("unique Characters directly(without any duplicates) =");
   System.out.println(Charac);
	}
}
