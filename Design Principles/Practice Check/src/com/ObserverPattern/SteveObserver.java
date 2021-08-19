package com.ObserverPattern;

public class SteveObserver implements INotificationObserver {
	
	String observerName = "Steve";
	
	@Override
	public void OnServerDown() {
		System.out.println(observerName + " - the notification has been received");
	}
}
