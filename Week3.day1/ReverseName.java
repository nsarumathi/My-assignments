package week3.day1;

public class ReverseName {
	public static void main(String[] args) {

		String Name = "Sarumathi Nallasivam";
		String output="Sarumathi nallasivam";
		System.out.println("Name=="+ Name);
		System.out.println(Name.charAt(10));
//index of
		System.out.println(Name.indexOf('N'));
		System.out.println(Name.indexOf('i', 9));
		System.out.println(Name.indexOf("sivam"));
		System.out.println(Name.indexOf("as", 3));
//contains- gives boolean output
		System.out.println(Name.contains("mathi"));
//String to char conversion
		char[] Each=Name.toCharArray();
		System.out.println(Each);		
//equalsIgnoreCase=it will ignore lower & upper case letters even-though it has same characters 
		if(Name.equalsIgnoreCase(output)) {System.out.println("true");}
		else{System.out.println("False");}
//equals==Case sensitive
		if(Name.equals(output)) {System.out.println("true");}
		else{System.out.println("False");}
//content equals==creates instance of stringBuffer
		StringBuffer Input=new StringBuffer("Nallasivam");
		if(Name.contentEquals(Input)) {System.out.println("true");}
		else{System.out.println("False");}
//content equals==creates instance of Character sequence	
		CharSequence New="Sarumathi Nallasivam";
		if(Name.contentEquals(New)) {System.out.println("true");}
		else{System.out.println("False");}
		
//Full reverse	
		
		String[] split=Name.split("");
		 System.out.println("Print String Name==");
		for (int i=0;i < split.length; i++) {
	           System.out.println(split[i]+" ");}
		
		System.out.println("Reverse of Name==");
		for (int j = split.length-1 ; j >=0 ; j--) {
	           System.out.print(split[j]+" ");}
//Specific Reverse	            
		String input="Sarumathi Nallasivam was located in chennai";
        String[] splitS=input.split(" ");        
	            
        System.out.println("Even Char in input line==");
        for (int i = 0; i < splitS.length; i++) {
            if(i%2!=0) {
                char[] charArray = splitS[i].toCharArray();
                for (int j=charArray.length-1;j>=0 ; j--) {
                    System.out.print(charArray[j]);}}
            else {
                System.out.print(splitS[i]); }
            System.out.print(" "); }
				
        System.out.println("Odd Char in input line==");
        for (int m = 0; m < splitS.length; m++) {
        	if(m%2==0){
        	 char[] Array=splitS[m].toCharArray();
             for (int n=Array.length-1;n>=0;n--) {
        	   System.out.print(Array[n]);
        	   }
        	  }
        	else {System.out.print(splitS[m]);}
        	System.out.print("  ");
        }}
}