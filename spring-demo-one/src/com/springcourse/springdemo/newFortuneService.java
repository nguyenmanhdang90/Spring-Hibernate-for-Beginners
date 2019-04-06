package com.springcourse.springdemo;

import java.util.Random;

public class newFortuneService implements FortuneService {

	private Random rd = new Random();

	private String[] fortunes;

	public String[] getFortunes() {
		return fortunes;
	}

	public void setFortunes(String[] fortunes) {
		this.fortunes = fortunes;
	}

	@Override
	public String getFortune() {
		return fortunes[rd.nextInt(3)];
	}

}
