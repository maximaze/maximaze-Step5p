package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aspect.ExeTimeAspect;
import chap07.Calculator;
import chap07.ImpeCalculator;
import chap07.RecCalculator;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true) // 클래스 타입
public class AppCtx3 {
	@Bean
	public ExeTimeAspect exeTimeAspect() {	// 부가기능
		return new ExeTimeAspect();
	}

	@Bean
	public Calculator calculator() {		// 핵심기능		
		return new RecCalculator();
	}
	
	// 클래스 타입으로 리턴
	@Bean
	public ImpeCalculator impeCalulator() {
		return new ImpeCalculator();
	}
}
