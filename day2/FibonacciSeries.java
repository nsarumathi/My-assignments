package week1.day2;

public class FibonacciSeries {
	
	public static void main(String[] args){
		int range=8; int n1=0;int n2=1;
		int sum;
		System.out.println(n1);
	for(int i=1;i<=range;i++) {
	    sum=n1+n2;
	    n1=n2;
		n2=sum;
		System.out.println(sum);
	}}}