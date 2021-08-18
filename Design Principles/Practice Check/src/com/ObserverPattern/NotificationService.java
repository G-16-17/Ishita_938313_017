package com.ObserverPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NotificationService implements INotificationService {

	List<INotificationObserver> observerList = new ArrayList<INotificationObserver>();

	@Override
	public void AddSubscriber(INotificationObserver o) {
		observerList.add(o);
	}

	@Override
	public void RemoveSubscriber(INotificationObserver o) {
		observerList.remove(observerList.indexOf(o));
	}

	@Override
	public void NotifySubscriber() {
		for (Iterator<INotificationObserver> it = observerList.iterator(); it.hasNext();) {
			INotificationObserver o = it.next();
			o.OnServerDown();
		}
	}
}
