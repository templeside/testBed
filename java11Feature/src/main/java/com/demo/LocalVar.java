package com.demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LocalVar {

	public static void main(String[] args) {
		Cal obj = (a,b)-> a+b;
		System.out.println(obj.add(10,20));
		
		TimeUnit timeUnit = TimeUnit.DAYS;
		System.out.println(timeUnit.convert(Duration.ofHours(72)));
	}
}
interface Cal{
	int add(int x, int y);
}
