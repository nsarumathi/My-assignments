package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
public static void main(String[] args) {
	String Text="We learn java basics as part of java sessions in java week1";
	int count;
	String[] words=Text.split(" ");   
	System.out.println("Words Length = "+ words.length);
	List<String> ORG =new ArrayList<String>(Arrays.asList(words));
	System.out.println("Original String == " + ORG);
	
	System.out.println("Duplicates WORDS in STRING are == ");
	List<String> Duplicate =new ArrayList<String>();
	for(int i=0;i<words.length;i++) {
		count=1;
		for(int j=i+1;j<words.length;j++) {
			if(words[i].equals(words[j])) { 
				count++ ; 
				words[j]="";}}
			 if(count>1) System.out.println(words[i]);
			 Duplicate.add(words[i]);}
	System.out.println("String After Duplicate Removal = "+ Duplicate);
	String[] Dup=Duplicate.toArray(new String[Duplicate.size()]);
	System.out.println("Final String is == ");
	for (String Final: Dup) {
		System.out.print(Final+" ");}
	}
}
