[S05ComponentScan]

1. ������Ʈ ��ĵ
2. @Component
3. ������Ʈ ��ĵ ���
	- @Component
	- @Controller
	- @Service
	- @Repository
	- @Aspect
	- @Configuration
	
(@ComponentScan)
1. ������ ��Ű���� �� ���� ��Ű���� ���� Ŭ������ ��ĵ ���
2. ��ĵ ��� �ش��ϴ� Ŭ���� �߿��� @Component �������̼��� ���� Ŭ������ ��ü�� �����ؼ� ������ ���
3. @Configuration �������̼� �ִ� Ŭ������ �Բ� ����
4. ��:
	- ComponentScan(basePackages={"package"})
	- ComponentScan(basePackages={"package;package"})
	- ComponentScan(basePackages={"package", "package"})
	- ComponentScan(basePackages={Class1.class, Class2.class})

(@Component)
1. ��ĵ ����� �Ǵ� Ŭ�����μ� ��ü�� ���
2. ��ü �̸��� �������� ������ Ŭ���� �̸����� ù���ڸ� �ҹ��� �����ؼ� Ŭ���� �̸����� ���
	- ��1: �Ʒ� Component Ŭ������ ��ü �̸��� "component"�� �ȴ�. 
		@Component
		public class Component{
		}
3. ��������� ��ü �̸��� ����
	- ��2: �Ʒ� Component Ŭ������ ��ü �̸��� "comp"�� �ȴ�.
		@Component("comp")
		public class Component{
		}
	
(ManualBean.java)
package config;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(TYPE)
public @interface ManualBean {

}
	
	

(MainForSpring.java)
