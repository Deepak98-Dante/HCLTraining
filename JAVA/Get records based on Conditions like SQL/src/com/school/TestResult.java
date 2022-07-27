package com.school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestResult {
	
	public static void main(String args[])
	{
		List<Student> stu=new ArrayList();
		stu.add(new Student(11, "Deepak", "Science", 80));
		stu.add(new Student(21, "Arun", "Maths", 54));
		stu.add(new Student(13, "Iswarya", "SocialScience", 45));
		stu.add(new Student(16, "Rahul", "Science", 76));
		stu.add(new Student(19, "Nandini", "Maths", 30));
		stu.add(new Student(20, "Sagar", "English", 40));
		
		List<Student> report;
		report=stu.stream().filter(s->s.getMark()>50).collect(Collectors.toList());
		
		//report.clear();
		
		report=stu.stream().sorted((e1, e2) ->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
		report=stu.stream().sorted((e1, e2) ->e2.getMark() - e1.getMark()).collect(Collectors.toList());
		report=stu.stream().filter(e->(e.getMark() > 40 && e.getSubject().equals("Science"))).collect(Collectors.toList());
		
		report.forEach(e->System.out.println("RollNo :"+e.getRollno()+" Name : "+e.getName()+" Subject : "+e.getSubject()+" Mark : "+e.getMark()));
		
		List<Employee> emp=new ArrayList();
		emp.add(new Employee("Deepak", "CS"));
		emp.add(new Employee("Karishma", "EC"));
		emp.add(new Employee("Harshad", "CS"));
		emp.add(new Employee("Sagar", "EC"));
		emp.add(new Employee("Harshad", "Mech"));
		emp.add(new Employee("Amit", "CS"));
		emp.add(new Employee("Himanshu", "EC"));   
		   
		List<String> department=emp.stream().map(emp1->emp1.getDepartment()).distinct().collect(Collectors.toList());
		
		System.out.println(emp.stream().map(e->e.getName()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		System.out.println(department);
		
		List<Employee> emp2=emp.stream().filter(em2->em2.getName().equals("Harshad")).collect(Collectors.toList());
		System.out.println(emp2);
		for (int i=0;i<department.size();i++)
		{
		String depart=department.get(i);	
		System.out.println("Count of " +depart+" Department Employees :"+emp.stream().filter(employee->employee.getDepartment().equals(depart)).count());
		}
		
		
	}

}
