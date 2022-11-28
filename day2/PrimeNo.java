package week1.day2;

public class PrimeNo {
    public static void main(String[] args) {
		int a=13;
		boolean flag=false;

	for(int i=2;i<=a/2;i++) {
    if (a%i==0) {flag=true;
    break;}}
    if(flag==false) {System.out.println(a+"=prime no");}
	    else {System.out.println(a+"=Non-Prime no");
}
    {System.out.println("ANOTHER FORMAT");
    for(int i=2;i<a;i++) {
        if (a%i==0) {flag=true;
        break;}}
        if(flag==false) {System.out.println(a+"=prime");}
    	    else {System.out.println(a+"=Non-Prime");}}}}
