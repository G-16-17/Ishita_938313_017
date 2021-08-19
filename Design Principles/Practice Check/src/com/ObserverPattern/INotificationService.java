package com.ObserverPattern;

public interface INotificationService {
	
	public void AddSubscriber(INotificationObserver iNObserver);

	public void RemoveSubscriber(INotificationObserver iNObserver);

	public void NotifySubscriber();
}
