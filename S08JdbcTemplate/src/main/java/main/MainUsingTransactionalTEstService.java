package main;

import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppCtx;
import dbquery.DbQueryTR;
import spring.dao.Member;
import spring.service.TransactionalTestService;

public class MainUsingTransactionalTEstService {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		
		TransactionalTestService tts = ctx.getBean(TransactionalTestService.class);
		tts.transactionOne(new Member("tts@tts.co.kr", "1234", "TTS", LocalDateTime.now()));
		tts.transactionTwo(new Member("tts2@tts.co.kr", "1234", "TTS", LocalDateTime.now()));
		
		ctx.close();
	}
}
