[S07AOP]

1. Aspect Oriented Programing
2. 관점 지향 프로그래밍
3. 핵심기능과 부가기능의 원리

(핵심기능)
1. 처리하고자 하는 본연의 기능(비즈니스 로직)
2. 목적을 이루기 위해서 반드시 수행해야 할 작업
3. PMBOK(Project Management) 관점에서 보면 그리티컬 패스(Critical Path)와 비슷
	WBS(Work Breakdown Structure) 업무 분업 구조
4. 서비스를 이루기 위해서 반드시 수행해야 할 핵심작업

(부가기능)
1. 핵심기능을 지원하는 기능
2. 반드시 수행되지 않아도 되는 기능

(AOP)
1. 타겟(Target)
	- 핵심기능을 담고 있는 모듈
2. 어드바이스(Advice)
	- 타겟에 제공할 부가 기능
	- 언제 공통 관심 기능을 핵심 로직에 적용할지 정의
3. 조인포인트(Join Point)
	- 어드바이스가 적용될 위치
4. 포인트컷(Pointcut)
	- 어드바이스를 적용할 타겟을 선별하는 표현식
	- Jointpoint의 부분 집합으로서 실제 Advice가 적용되는 Joinpoint를 나타낸다.
5. Aspect
	- AOP의 기본 모듈
6. Weaving
	- Advice를 핵심 로직 코드에 적용하는 것

(AOP 애너테이션)
1. @Aspect
2. @Pointcut
3. @Around
4. @EnableAspectAutoProxy

(스프링에서 AOP를 지원하는 기능)
1. 런타임에 프록시(대행자) 객체를 생성해서 공통기능(부가기능)을 삽입하는 방법
2. @EnaleAspectJAutoProxy
	- 인터페이스로 빈객체를 만듬
	- Calculator cal2 = ctx.getBean("impecalculator", Calculator.class);
3. @EnableAspectJAutoProxy(proxyTargetClass=true)
	- 빈객체가 인터페이스를 상속해서 프록시를 생성했을 때
	- 클래스 타입으로 빈객체를 만듬
	- ImpeCalculator cal2 = ctx.getBean("impecalculator", ImpeCalculator.class);

(예제)
1. 핵심기능 : 전자계산기
	- n! : 1x2x3... xn
2. 부가기능 : 계산시간도출

(MainAspectWithCache.java)
실행순서 :
	1. CacheAspect -> ExeTimeAspect -> CacheAspect(cache) -> 결과리턴
	2. CacheAspect -> cache -> 결과리턴




