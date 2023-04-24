package typehier;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainForType3 {

	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx4Type.class);
		// 상속관계를 할때 위로 받는건 괜찮지만 아래로 받는건 안됨
		// 부모껄로 만들고 자식껄로 접근하면 안됨
		
		// 인터페이스 printer로 빈객체를 받겠다고 해 놓고
		// 구현 클래스인 ConSolePrinter로 받을 수 없다.
		// ConsolePrinter p1 = ctx.getBean("printer", Printer.class);
		
		ConsolePrinter p2 = ctx.getBean("printer", ConsolePrinter.class);
//		System.out.println("p1 == p2 : " + (p1 == p2));
		ctx.close();
	}
}