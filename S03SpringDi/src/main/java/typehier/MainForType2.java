package typehier;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainForType2 {

	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx4Type.class);
		Printer p1 = ctx.getBean("printer", Printer.class);
//		ConsloePrinter p2 = ctx.getBean("printer", ConsolePrinter.class);
//		System.out.println("p1 == p2 : " + (p1 == p2));
		ctx.close();
	}
}