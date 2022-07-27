package com.java.features;

public class MethodRef {
	
	public void message()
	{
		System.out.println("Welcome");
	}
	
	public static void domessage()
	{
		System.out.println("Static Method Welcome");
	}
	
//	public static void main(String args[]) {
//		
//		
//		Drawable d=new MethodRef()::message;
//		Drawable d1=MethodRef::domessage;
//		d.draw();
//		d1.draw();	
//			
//	}

}
