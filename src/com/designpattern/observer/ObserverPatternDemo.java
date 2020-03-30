package com.designpattern.observer;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		Publisher publisher=new Publisher();
		Observer observerOne=new SubscriberOne(publisher);
		Observer observerTwo=new SubscriberTwo(publisher);

		publisher.add(observerOne);
		publisher.add(observerTwo);
		publisher.setMessage("message 1");
		publisher.update();
		publisher.remove(observerOne);
		publisher.setMessage("message 2");
		publisher.update();
	}

}
