package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class Setunique {
public static void main(String[] args) {
	String Companyname="google";
	char[] A=Companyname.toCharArray();
	Set<Character> unique=new HashSet<Character>();
	Set<Character> Duplicate=new HashSet<Character>();
	for(int i=0; i<A.length ; i++) {
		Boolean Check=unique.add(A[i]);
		if(!Check) {Duplicate.add(A[i]);}}
	System.out.println("unique=="+unique);
	System.out.println("Duplicate=="+Duplicate);
}}
