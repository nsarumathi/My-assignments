package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FindIntersection {
	public static void main(String[] args) {
		int [] a= {3,2,11,4,6,7};
		int [] b= {1,2,8,4,9,7};
		List<Integer> list1= new ArrayList<Integer>();
		List<Integer> list2= new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			list1.add(a[i]);}
		for(int j=0;j<b.length;j++) {
				list2.add(b[j]);}
		System.out.println("list1=="+ list1);
		System.out.println("list2==" + list2);
				
		for(int i=0;i<list1.size();i++) {
			for(int j=0;j<list1.size();j++) {
				if(list1.get(i)==list2.get(j)) {
					System.out.println("Intersection Elements=="+list1.get(i));}}}
			
	//using set		
    	Set<Integer> A=new HashSet<Integer>(list1);
		Set<Integer> B=new HashSet<Integer>(list2);
	//B set
		Set<Integer> intersection=new HashSet<Integer>(A);
		intersection.retainAll(B);
		System.out.println("Intersection elements in B set=="+ intersection);
	//A set
		Set<Integer> intersection1=new HashSet<Integer>(B);
		intersection1.retainAll(A);
		System.out.println("Intersection elements in A set=="+ intersection1);
	
}}