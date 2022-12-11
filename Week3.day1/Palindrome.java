package week3.day1;

public class Palindrome {
	public static void main(String[] args) {
		String Name="madam";
		String Rev="";
		String[] split=Name.split(" ");
		for(int i = split.length-1; i >= 0 ; i--) {
			Rev=Rev+split[i];
			System.out.println(Rev);
		}
		
		if(Name.equals(Rev)) {System.out.println("given string is palindrome");}
		else { System.out.println("Given string is not an palindrome");
	}

}}
