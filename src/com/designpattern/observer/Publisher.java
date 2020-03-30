package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject{

	private List<Observer> observers = new ArrayList<>();
	
	private String message;
	
	@Override
	public void add(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void remove(Observer o) {
		observers.remove(o);
		
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void update() {
		for(Observer observer:observers) {
			observer.update();
		}
	}

}
