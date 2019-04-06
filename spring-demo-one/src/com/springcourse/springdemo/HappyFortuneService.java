package com.springcourse.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is happy fortune service";
	}

}
