package com.ObserverPattern;

public class Main {

	public static void main(String[] args) {
		
		SteveObserver so = new SteveObserver();
		JohnObserver jo = new JohnObserver();

		NotificationService ns = new NotificationService();

		ns.AddSubscriber(so);
		ns.AddSubscriber(jo);
		ns.NotifySubscriber();
		ns.RemoveSubscriber(so);

	}

}
