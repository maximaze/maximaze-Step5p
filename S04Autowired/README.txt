[S04Autowired]

1. ���� �ڵ� ����
2. @Autowired�� �̿��� ���� �ڵ� ����

(�ҽ�����)
1. config
	- �� ��ü ��� 
2. main
	- ���� ���(main)
3. spring
	- ���� ���
	
(�� ����)
1. ��ġ�ϴ� ���� ���� ��� ����
2. ������ ������ �޼ҵ��� �̸��� �ٸ����� �ش��ϴ� �� ��ü�� �����ϴ�
	�޼ҵ尡 �ϳ��� ������ ���� ó��	
3. ������ �� ��ü�� �����ϴ� Ÿ���� ������ �ִ��� 
	�޼ҵ��� �̸��� �ٸ��� ���� ó��
4. ����: ������ �� ��ü�� ������ �����ϴ� �̸��� �ٸ� �޼ҵ尡 ������ ���� ���
	@Autowired�� ������ �̸��� ��ġ�ϴ� �޼ҵ尡 ������ ����	
		
(@Qualifier)
1. �ڵ� ���� ������ ���� �� �� �̻��� �� �ڵ� ������ ���� ����
2. @Qualifier("��ü")
	- AppCtx.java : @Qualifier("printer")

(@Autowired)	
1. @Autowired(required = false)
	- �ش��ϴ� ��ü�� ��� ���ܰ� �߻����� ����
	- �ش��ϴ� ��ü�� ������ �ڵ� ������ ���� ����
	- ������� ����
	- ���� : MemberPrinter.SetDateFormatter(...)
2. @Autowired : Optional<...> : �ڹ�8���� ���� 
	- ��ü�� �����ϸ� Optional.isPresent()�� true ����
	- ���� : 
	@Autowired
	public void setDateFormatter(Optional<DateTimeFormatter> formatterOpt) {
	}
3. @Autowire : @Nullable
	- ��ü�� ������ null�� ����	
		
		