package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyOwnFortuneService implements FortuneService {

	@Value("${MyOwnFortuneService.content}")
	private String[] content;

	private Random rd = new Random();

	@Override
	public String getFortune() {
		return this.content[rd.nextInt(this.content.length - 1)];
	}

}
