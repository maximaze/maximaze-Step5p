package chap07;

public class RecCalculator implements Calculator { // 제귀호출(자기자신을 호출)

	@Override
	public long factorial(long num) {
		System.out.printf("factorial(%d)\n", num);
        if (num == 0)
            return 1;
        else
            return num * factorial(num - 1);
	}

}
