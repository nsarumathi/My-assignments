package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		int sum=0;int sum1=0;int m;
		int length=arr.length;
		Arrays.sort(arr);
		System.out.println(arr);
		System.out.println(length);
		
		for(int i=0;i<=length-1;i++) {
			sum=sum+arr[i];}
       for(int j=0;j<=length+1;j++) {
	        sum1=sum1+j;}
            m=sum1-sum;
       System.out.println(sum+"=Array sum ");
       System.out.println(sum1+"Total sum");
       System.out.println(m+"=Missing Element");
		}}


