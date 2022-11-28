package week1.day2;

import java.util.Arrays;

public class findMinMax {
	public static void main(String[] args) {
		int[] marks = {22, 3981, -19, 82, 0, 45, 37};
		int length =marks.length;
		System.out.println(length);
		System.out.println(marks);
		Arrays.sort(marks);
		
	    int max=marks[0];
		int min=marks[0];
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(marks[i]<=marks[j]) {max=marks[i];}
				else if(marks[i]>=marks[j]){min=marks[i];}}}
			System.out.println(max);
			System.out.println(min);
			
			
System.out.println("another Format");
			
		int a=marks[0];
		int b=marks[length-2];
		for(int k=0;k<length;k++) {
			if(a == marks[k]) {
				System.out.println(a);}
			if(b == marks[k]) {
				System.out.println(b);}
}}}
		
		
