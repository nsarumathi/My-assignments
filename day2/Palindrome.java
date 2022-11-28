package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		int num=34343,rem;
		int org=num;
		int rev=0;
		for(int a=1;a<=5;a++) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;	}
		System.out.println(rev);
		if(org==rev) {System.out.println(org +"=Palindrome no");}
		else {System.out.println(org +"=Non-Palindrome no");}
}}