[S07AOP]

1. Aspect Oriented Programing
2. ���� ���� ���α׷���
3. �ٽɱ�ɰ� �ΰ������ ����

(�ٽɱ��)
1. ó���ϰ��� �ϴ� ������ ���(����Ͻ� ����)
2. ������ �̷�� ���ؼ� �ݵ�� �����ؾ� �� �۾�
3. PMBOK(Project Management) �������� ���� �׸�Ƽ�� �н�(Critical Path)�� ���
	WBS(Work Breakdown Structure) ���� �о� ����
4. ���񽺸� �̷�� ���ؼ� �ݵ�� �����ؾ� �� �ٽ��۾�

(�ΰ����)
1. �ٽɱ���� �����ϴ� ���
2. �ݵ�� ������� �ʾƵ� �Ǵ� ���

(AOP)
1. Ÿ��(Target)
	- �ٽɱ���� ��� �ִ� ���
2. �����̽�(Advice)
	- Ÿ�ٿ� ������ �ΰ� ���
	- ���� ���� ���� ����� �ٽ� ������ �������� ����
3. ��������Ʈ(Join Point)
	- �����̽��� ����� ��ġ
4. ����Ʈ��(Pointcut)
	- �����̽��� ������ Ÿ���� �����ϴ� ǥ����
	- Jointpoint�� �κ� �������μ� ���� Advice�� ����Ǵ� Joinpoint�� ��Ÿ����.
5. Aspect
	- AOP�� �⺻ ���
6. Weaving
	- Advice�� �ٽ� ���� �ڵ忡 �����ϴ� ��

(AOP �ֳ����̼�)
1. @Aspect
2. @Pointcut
3. @Around
4. @EnableAspectAutoProxy

(���������� AOP�� �����ϴ� ���)
1. ��Ÿ�ӿ� ���Ͻ�(������) ��ü�� �����ؼ� ������(�ΰ����)�� �����ϴ� ���
2. @EnaleAspectJAutoProxy
	- �������̽��� ��ü�� ����
	- Calculator cal2 = ctx.getBean("impecalculator", Calculator.class);
3. @EnableAspectJAutoProxy(proxyTargetClass=true)
	- ��ü�� �������̽��� ����ؼ� ���Ͻø� �������� ��
	- Ŭ���� Ÿ������ ��ü�� ����
	- ImpeCalculator cal2 = ctx.getBean("impecalculator", ImpeCalculator.class);

(����)
1. �ٽɱ�� : ���ڰ���
	- n! : 1x2x3... xn
2. �ΰ���� : ���ð�����

(MainAspectWithCache.java)
������� :
	1. CacheAspect -> ExeTimeAspect -> CacheAspect(cache) -> �������
	2. CacheAspect -> cache -> �������




