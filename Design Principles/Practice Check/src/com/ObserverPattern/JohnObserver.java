package com.ObserverPattern;

public class JohnObserver implements INotificationObserver {
	
	String observerName = "John";
	
	@Override
	public void OnServerDown() {
		System.out.println(observerName + " - the notification has been received");
	}
}
