package org.student;

import org.department.*;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("Name: Vignesh Kumar");
	}
	public void studentDept() {
		System.out.println("CSE");
	}
	
    public void studentID() {
		System.out.println("1099");
	}
    
    public static void main(String[] args) {
		Student stu=new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentID();
		stu.studentDept();
	}
}
