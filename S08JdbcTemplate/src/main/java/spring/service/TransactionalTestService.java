// @Transactional 테스트 서비스
package spring.service;

import org.springframework.transaction.annotation.Transactional;

import spring.dao.Member;
import spring.dao.MemberDao;

public class TransactionalTestService {
	private MemberDao memberDao;

	public TransactionalTestService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	@Transactional
	public void transactionOne(Member member) {
		System.out.println("[트렌젝션] One");
		
		System.out.println("[트렌젝션] 입력");
		this.memberDao.insert(member);
		System.out.println("입력테이터 : " + member);
		
		System.out.println("[트렌젝션] 수정");
		this.memberDao.update(member);
		
		System.out.println("[트렌젝션] 삭제");
		this.memberDao.delete(member.getId());
		
		System.out.println("[트렌젝션] 종료");
	}
	
	@Transactional
	public void transactionTwo(Member member) {
		System.out.println("[트렌젝션] Two");
		
		System.out.println("[트렌젝션] 입력");
		this.memberDao.insert(member);
		System.out.println("입력테이터 : " + member);
		
		System.out.println("[트렌젝션] 수정");
		member.setPassword("4321");
		this.memberDao.update(member);
		
		System.out.println("[트렌젝션] 종료");
	}
}
