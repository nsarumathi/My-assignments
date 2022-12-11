package org.student;

import org.Department.DepartmentName;
import org.college.College;

public class Student extends College {
	public void StudentName() {
		System.out.println("Mathi");}
	public void StudentID() {
		System.out.println("310678");}
	public void StudentDept() {
		System.out.println("IT");}
public static void main(String[] args) {
	College Info=new College();
	DepartmentName Field=new DepartmentName();
	Student Details=new Student();
	Info.CollegeName();
	Info.CollegeCode();
	Info.CollegeRank();
	Field.DeptName();
	Details.StudentName();
	Details.StudentID();
	Details.StudentDept();
}

}
