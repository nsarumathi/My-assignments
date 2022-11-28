package week1.day2;

import java.util.Arrays;

public class FindMin {
	public static void main(String[] args) {
		
	int[] no = {23,45,67,32,89,22};
	int length1=no.length;
	Arrays.sort(no);
	
	int a=no[0];
	int b=no[length1-2];
	for(int k=0;k<length1;k++) {
		if(a == no[k]) {
			System.out.println(a);}
		if(b == no[k]) {
			System.out.println(b);}
	
	
}}}
