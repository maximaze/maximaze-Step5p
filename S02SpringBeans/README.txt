[02SpringBeans]

1. ������ ���� ����ϱ�
	- IoC(Inversion of Control) : ������ ����
	- ��ü�� ���� �ֱ� ������ ������ �����ӿ�ũ���� ��� 
2. ���̺� ������Ʈ ����
	- File / New / Maven Project
	- Create a simple project(üũ)
	- Location: ������Ʈ ���
		. WorkSpace �Ʒ� ������Ʈ ������ ���� ����
	- Configure project
		. Group ID: S02SpirngBeans
		. Artifact ID: S02SpirngBeans
	- Maven: UpdateProject
3. ���̺� �����
	- https://mvnrepository.com/
	- �˻�: spring context
	- ����: spring Context = 5.0.2RELSEASE
4. ������ ���� ���� Annotation 
	- @Configuration
	- @Bean
5. ������ ���� ���
	- AnnotationConfigApplicationContext Ŭ����
	- getBean() �޼ҵ�
	
	
	
(pom.xml)

	<!-- https://mvnrepository.com/artifact/org.springframework/spring-context -->
	<dependency>
	    <groupId>org.springframework</groupId>
	    <artifactId>spring-context</artifactId>
	    <version>5.0.2.RELEASE</version>
	</dependency>
	
	<dependencies>
  		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>5.0.2.RELEASE</version>
		</dependency>
  	</dependencies>
  	
  	<build>
		<plugins>
			<plugin>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.7.0</version>
				<configuration>
					<source>1.8</source>
					<target>1.8</target>
					<encoding>utf-8</encoding>
				</configuration>
			</plugin>
		</plugins>
	</build>
	
-----------------------------------------------------------
(AnnotationConfigApplicationContext)
1. ��ü�� �����ϰ� �ʱ�ȭ �۾� ����
2. �ڹ� �ֳ����̼��� �̿��Ͽ� Ŭ�����κ��� ��ü ���� ������ ���

(BeanFactory InterFace)
1. ��ü ������ �˻��� ���� ��� ����
2. ��ü �˻�
3. �̱��� / ������Ÿ�� ������ Ȯ���ϴ� ��� ����

(ApplicationContext)
1. �޽���, ������/ȯ�溯�� ���� ó�� �� �� �ִ� ��� ����







