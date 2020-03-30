package com.designpattern.observer;

public class SubscriberTwo implements Observer{
	
	private Publisher publisher;
	
	public SubscriberTwo(Publisher  publisher) {
		this.publisher=publisher;
	}
	
	@Override
	public void update() {
		System.out.println("SubscriberTwo recieved message : "+this.publisher.getMessage());
		
	}

}
