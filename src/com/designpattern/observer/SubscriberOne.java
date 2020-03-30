package com.designpattern.observer;

public class SubscriberOne implements Observer{

	private Publisher publisher;
	
	public SubscriberOne(Publisher  publisher) {
		this.publisher=publisher;
	}
	
	@Override
	public void update() {
		System.out.println("SubscriberOne recieved message : "+this.publisher.getMessage());
		
	}

}
