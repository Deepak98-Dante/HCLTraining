package com.school;

public class Student {

public int rollno;
public String name;
public String Subject;
public int mark;
public Student(int rollno, String name, String subject, int mark) {
	
	this.rollno = rollno;
	this.name = name;
	this.Subject = subject;
	this.mark = mark;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSubject() {
	return Subject;
}
public void setSubject(String subject) {
	Subject = subject;
}
public int getMark() {
	return mark;
}
public void setMark(int mark) {
	this.mark = mark;
}


	
}
