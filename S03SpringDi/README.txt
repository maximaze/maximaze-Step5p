[S03SpringDI]

1. Spring Dependency Injection(���� ����)
2. ��ü ���� ���� ����


(MainForAssember.java)
���: new abc@ez.co.kr ȫ�浿 1234 1234
����: change abc@ez.co.kr 1234 9999
����: exit


(@Bean)
1. @Bean �ֳ����̼��� �����Ǹ� �޼ҵ��̸��� ��ü �̸�
3. �� ��ü�� �̱��� ��ü
3. ����
	@Bean 
	public ����Ÿ�� �޼ҵ��̸�(...) {
	}
	
4. �� ��ü ��� ���
	Ŭ�����̸� ��ü = ctx.getBean("��ü", Ŭ�����̸�.class);
	Ŭ�����̸� ��ü = (Ŭ�����̸�)ctx.getBean("��ü");
	
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
	MemberRegisterService regSvc = ctx.getBean("memberRegSvc", MemberRegisterService.class);
	MemberRegisterService regSvc = (MemberRegisterService)ctx.getBean("memberRegSvc");

(���� ��¥)
�ҽ�: Member.java, MemberRegisterService.java

import java.time.LocalDateTime;
LocalDateTime registerDateTime = LocalDateTime.now();

System.out.printf(�����=%tF", member.getRegisterDateTime());

't', 'T'	date/time	Prefix for date and time conversion characters. See Date/Time Conversions.	
'F'	ISO 8601 complete date formatted as "%tY-%tm-%td".

(@Autowired)
1. �ڵ�����, �ڵ�����
2. ����
	@Autowired
	private Ŭ�����̸� ��ü;
3. ����: 
	- AppConf1.java
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	- AppConf1.java�� �ִ� �޼ҵ� memberDao�� �ڵ� ����(����)
	- AppConf2.java
	@Autowired
	private MemberDao memberDao;

(AppConfImport.java)
1. AppConf2.java�� ����Ʈ(import)
2. @Import({AppConf2.class})

(MainForSpring2.java)
1. ���� ������ �� ���� 
2. �� : AppConf1.java, AppConf2.java�� �ϳ��� ���� ���� ���
	ctx = new AnnotationConfigApplicationContext(AppConf1.class, AppConf2.class);
3. ������ ���� ���� ���� Ŭ�������� �ߺ��Ͽ� ����ϸ�
	���������� ������ ���� Ŭ������ ����(Overriding) ����.
			