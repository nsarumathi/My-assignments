package polymorphism.oop;

public class Students {
	//overloading
	public void getStudentinfo (int id) {
		System.out.println("Student Id="+ id);
	}
	public void getStudentinfo(int id,String Name) {
		System.out.println("Student Id="+ id);
		System.out.println("Student Name="+ Name);
	}
	public void getStudentinfo (String email,String Phone) {
		System.out.println("Student email="+ email);
		System.out.println("Student Phone= "+ Phone);
	}
	public static void main(String[] args) {
		Students Info=new Students();
		Info.getStudentinfo(123);
		Info.getStudentinfo(871 , "LATHA");
		Info.getStudentinfo("avc@gmail.com", "987607898");
		
}}
