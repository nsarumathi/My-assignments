package week3.day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String Text1="stops";
		String Text2="potss";
	int Length1=Text1.length();
	int Length2=Text2.length();
	char[] A=Text1.toCharArray();Arrays.sort(A);
	char[] B=Text2.toCharArray();Arrays.sort(B);
	
	if(Length1==Length2) {
	Boolean Final=Arrays.equals(A, B);
	if(Final) { 
	System.out.println("it is an anagram");}}
	else {System.out.println("not an anagram");}
	
//Second Format
	if(Length1==Length2) {
		for(int i=0 ;i <Length1 ; i++) {
				for(int j=0 ; j <Length2 ; j++) {
					if(A[i]==(B[j])) {System.out.print(A[i]);}}}
	System.out.println("\n" +"It is an anagram");}
	else {System.out.println("not an anagram");}
	}}			