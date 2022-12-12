package week3.day2;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNO {
	public static void main(String[] args) {
	  int[] NO= {1,2,4,5,6,7,8,9,10,8}; 
	  Set<Integer> Numset=new TreeSet<Integer>();
	  Set<Integer> DupNumset=new TreeSet<Integer>();
	  for(int i=0; i<NO.length ; i++) {
			Boolean Check=Numset.add(NO[i]);
			if(!Check) {
				DupNumset.add(NO[i]);}}
	  System.out.println("Sorted Set=="+ Numset);
	  
	  List<Integer> list= new ArrayList<Integer>(Numset);
	  int cnt=list.size();
	  System.out.println("Numset size==" + cnt);
	  
	  for(int i=0;i<cnt-1;i++) {
		  if(list.get(i)!=list.get(i+1)-1)
		       {System.out.println("Missing no==" + (list.get(i+1)-1));}}
	}}
	  
	

