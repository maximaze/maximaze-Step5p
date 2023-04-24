[S06BeanLifecycle]

1. ��ü �����ֱ� ����
	- �����̳� �ʱ�ȭ�� ����
	- ��ü�� ����
	- ���� ����
	- �ʱ�ȭ
	- �Ҹ�
2. �̱���� ������Ÿ�� ����

(InitializingBean �������̽�)
- �� ��ü�� ������ �ڿ� �ʱ�ȭ ������ ��ġ�� ȣ�� �ȴ�.
public interface IntializingBean {
	void afterPropertiesSet() throws Exception;
}

(DisposableBean �������̽�)
- �� ��ü�� �Ҹ��ϱ� ������ ȣ�� �ȴ�.
public interface DisposableBean{
	void destory() throws Exception;
}

(Clinet.java)
- ��ü ������ �Ҹ� ������ Ư���ϰ� ó���� �ؾ��� ������ �߰��� �� �ִ�.
- afterPropertiesSet()�� �ʱ�ȭ ������ �ʿ��� ���� �߰�
- destory() �Ҹ� ������ �ʿ��� ���� �߰�

public class Client implements InitializingBean, DisposableBean {
@Override
	@Override
	public void afterPropertiesSet() throws Exception {
	}

	@Override
	public void destroy() throws Exception {
	}

-------------------------------------------------------------------
@Bean(initMethod = "connect", destroyMethod = "close")
public Client2 client2() {
}

public class Client2 {
	public void connect() {
	}
	public void close() {
	}
}

---------------------------------------------------------------------
1. ��ü ��Ͽ��� �ֳ����̼� �Ӽ��� �̿��Ͽ� ��ü�� ������ �Ҹ������
   ó���ؾ� �� �ʿ��� ������ ������ �� �ִ�.
2. initMethoid="���������� ȣ��� �޼ҵ� �̸�"
   destroy="�Ҹ������ ȣ��� �޼ҵ� �̸�"
3. initMethod�� destoryMethod�� ���ǵǴ� �޼ҵ��� �Ķ���ʹ� ����� �Ѵ�.
4. ��:
	@Bean(initMethod = "��������", destroyMethod = "�Ҹ����")
	public Client2 client2() {
		return new Client2();
	}
	
	public class Client2 {
		public void ��������() { // ��ü�� ���������� ȣ��ȴ�.
		}
		public void �Ҹ����() { // ��ü�� �Ҹ������ ȣ��ȴ�.
		}
	}

---------------------------------------------------------------------
(�� ��ü�� ������ ���� ����)
1. @Scope("singleton")
	- �⺻������ �������� ������ �̱���
	- �ϳ��� ��ü�� ���ؼ� �ϳ��� ��ü�� ����
2. @Scope("prototype")
	- �� ��ü�� ���� �� ���� ���ο� ��ü�� ����
	- ������ ����������Ŭ�� ������ �ʴ´�.
	- ��ü�� �����ϰ� �����ϰ� �ʱ�ȭ�� ������ �Ҹ��� ó������ �ʴ´�.
	- ��ü�� �Ҹ꿡 ���ؼ��� å���� ���� �ʴ´�.
	
	

