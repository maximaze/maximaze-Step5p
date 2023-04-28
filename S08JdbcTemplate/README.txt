[S08JdbcTemplate]

1. DataSource
2. JdbcTemplate 쿼리
3. DB 관련 Exception
4. Transaction 처리

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

-- MEMBER.ID 시퀀스
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
(@TransactionManagement을 이용한 트랜잭션 처리)
1. 빈설정 : AppCtx.java
	- @EnableTransactionManagement
	- 플랫폼 트랜잭션 매니저
		@Bean
		public PlatformTransactionManager transactionManager() {
			DataSourceTransactionManager tm = new DataSourceTransactionManager();
			tm.setDataSource(dataSource());
			return tm;
		}
		
2. @Transactional 처리
	- 트랜잭션을 처리한 메소드에 @Transactional을 지정
	- 해당 메소드가 트랜잭션 단위로 처리가 됨
	- 예제 : ChangePasswordService
		@Transactional
		public void changePassword(String email, String oldPwd, String newPwd) {
			...
		}





