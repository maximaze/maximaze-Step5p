package main;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import chap07.Calculator;
import chap07.ImpeCalculator;
import config.AppCtx3;

public class MainAspect3 {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppCtx3.class);

		beanList(ctx);
		
		Calculator cal = ctx.getBean("calculator", Calculator.class);
		long fiveFact = cal.factorial(5); // 이게 실행될때는 부가기능을 붙여줘야한다고 설정
		System.out.println("cal.factorial(5) = " + fiveFact);
		System.out.println(cal.getClass().getName());
		
		// Aspect는 인터페이스 타입으로 받아야 한다.
		ImpeCalculator cal2 = ctx.getBean("ImpeCalculator", ImpeCalculator.class);
		long fiveFact2 = cal.factorial(5);
		System.out.println("cal.factorial(5) = " + fiveFact2);
		System.out.println(cal2.getClass().getName());
		ctx.close();
	}

	private static void beanList(AnnotationConfigApplicationContext ctx) {
		System.out.println("[빈객체 목록]");
		String[] names = ctx.getBeanDefinitionNames();
		Arrays.stream(names).forEach(name -> System.out.println(name));
	}

}
