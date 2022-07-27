package com.design.patterns;

public class DesignPatternTest {

	public static void main (String args[])
	{
		NotificationFactory notificationFactory=new NotificationFactory();
		Notification notification=notificationFactory.createNotification("SMS");
		notification.notifyUser();
	}

}
