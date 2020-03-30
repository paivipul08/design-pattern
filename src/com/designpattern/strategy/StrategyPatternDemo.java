package com.designpattern.strategy;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		Context context = new Context(new StrategyAdd());		
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new StrategySubstract());		
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

	}

}
