package com.hjj;

import com.hjj.model.Car;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
		Car bean = context.getBean(Car.class);
		System.out.println(bean);
	}
}
