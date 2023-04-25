[S08JdbcTemplate]

1. DataSource
2. JdbcTemplate ����
3. DB ���� Exception
4. Transaction ó��

(MEMBER TABLE)
DROP TABLE MEMBER;
CREATE TABLE MEMBER
(
    ID MEMBER NOT NULL,
    NAME varchar2(100) NOT NULL,
    EMAIL varchar2(255),
    PASSWORD varchar2(100),
    REGDATE DATE DEFAULT SYSDATE,
    CONSTRAINT PK_MEMBER_ID PRIMARY KEY(ID) 
);

-- MEMBER.ID ������
DROP SEQUENCE MEMBER_ID_SEQ;
CREATE SEQUENCE MEMBER_ID_SEQ
	START WITH 1
	INCREMENT BY 1
	MAXVALUE 99999
	NOCYCLE;

SELECT MEMBER_ID_SEQ.NEXTVAL FROM DUAL;
SELECT MEMBER_ID_SEQ.CURRVAL FROM DUAL;


(MySQL)
DataSource ds = new DataSource();
ds.setDriverClassName("com.mysql.jdbc.Driver");
ds.setUrl("jdbc:mysql://localhost/spring5fs?characterEncoding=utf8");
ds.setUsername("spring5");
ds.setPassword("spring5");
ds.setInitialSize(2);
ds.setMaxActive(10);
ds.setTestWhileIdle(true);
ds.setMinEvictableIdleTimeMillis(60000 * 3);
ds.setTimeBetweenEvictionRunsMillis(10 * 1000);
return ds;
		
(Oracle)
DataSource ds = new DataSource();
ds.setDriverClassName("oracle.jdbc.OracleDriver");
ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
ds.setUsername("HELLOUSER");
ds.setPassword("HELLOUSER");
ds.setInitialSize(2);
ds.setMaxActive(10);
ds.setTestWhileIdle(true);
ds.setMinEvictableIdleTimeMillis(60000*3);
ds.setTimeBetweenEvictionRunsMillis(10*10000);
return ds;

--------------------------------------------------------------
(@TransactionManagement�� �̿��� Ʈ����� ó��)
1. ���� : AppCtx.java
	- @EnableTransactionManagement
	- �÷��� Ʈ����� �Ŵ���
		@Bean
		public PlatformTransactionManager transactionManager() {
			DataSourceTransactionManager tm = new DataSourceTransactionManager();
			tm.setDataSource(dataSource());
			return tm;
		}
		
2. @Transactional ó��
	- Ʈ������� ó���� �޼ҵ忡 @Transactional�� ����
	- �ش� �޼ҵ尡 Ʈ����� ������ ó���� ��
	- ���� : ChangePasswordService
		@Transactional
		public void changePassword(String email, String oldPwd, String newPwd) {
			...
		}





