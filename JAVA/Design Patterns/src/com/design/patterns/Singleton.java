package com.design.patterns;

public class Singleton {
	
	//Early,instance will be created at load time
	//private static Singleton s=new Singleton();
	private static Singleton s;
	
	private Singleton()
	{
		System.out.println("Private Constructor");
	}

	public static Singleton getS() {
		if(s==null)
		{
			s=new Singleton();
		}
		return s;
	}

	public void doSometing()
	{
		System.out.println("Welcome to Singleton Design Pattern Concept");
	}
	
	
	 /*public static void main(String[] args) { // TODO Auto-generated method stub
	 Singleton s1=Singleton.getS();
	 Singleton s2=Singleton.getS();
	 System.out.println(s1);
	 System.out.println(s2); 
	 s1.doSometing();*/
	  
	  //}
	 
	

}
