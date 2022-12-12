package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class FindSecondLargest {
 public static void main(String[] args) {
	int[] data= {3,2,11,4,6,7,2,3,3,6,7};
	TreeSet<Integer> list=new TreeSet<Integer>();
	for(int i=0;i<data.length;i++) {
		list.add(data[i]);}
	System.out.println("List after duplicate no's"+list);
	System.out.println("lastdigit=="+list.last());
  int A=list.size();
  List<Integer> Check =new ArrayList<Integer>(list);
  System.out.println("(Set-list conversion to getindex)//List=="+ Check);
  System.out.println("Second largest No=="+Check.get(A-2));

}}
