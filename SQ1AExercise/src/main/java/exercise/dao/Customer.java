package exercise.dao;

import java.time.LocalDateTime;

import exercise.exceptions.WrongIdPasswordException;

public class Customer {
	private String id;
	private String name;
	private String pnum;
	private String zipcode;
	private String address;
	private Long point;
	private String grade;
	private LocalDateTime registerDateTime;
	
	public Customer(String id, String name, String pnum, String zipcode, String address, Long point) {
		this.id = id;
		this.name = name;
		this.pnum = pnum;
		this.zipcode = zipcode;
		this.address = address;
		this.point = point;
		this.registerDateTime = LocalDateTime.now();
	}
	
	public Customer(String id, String name, String pnum, String zipcode, String address, Long point, LocalDateTime registerDateTime) {
		this.id = id;
		this.name = name;
		this.pnum = pnum;
		this.zipcode = zipcode;
		this.address = address;
		this.point = point;
		this.registerDateTime = registerDateTime;
	}

	public Customer(String id, String name, String pnum, String zipcode, String address, Long point, String grade, LocalDateTime registerDateTime) {
		this.id = id;
		this.name = name;
		this.pnum = pnum;
		this.zipcode = zipcode;
		this.address = address;
		this.point = point;
		this.grade = grade;
		this.registerDateTime = registerDateTime;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return pnum;
	}
	public void setTel(String pnum) {
		this.pnum = pnum;
	}
	public String getPostcd() {
		return zipcode;
	}
	public void setPostcd(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPoint() {
		return point;
	}
	public void setPoint(Long point) {
		this.point = point;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public LocalDateTime getRegisterDateTime() {
		return registerDateTime;
	}
	public void setRegisterDateTime(LocalDateTime registerDateTime) {
		this.registerDateTime = registerDateTime;
	}

	@Override
	public String toString() {
		String msg = String.format("id(%s), name(%s), pnum(%s), zipcode(%s), address(%s), point(%d), grade(%s), regdate(%tF)",
				this.id, 
				this.name, 
				this.pnum,
				this.zipcode,
				this.address,
				this.point,
				this.grade,
				this.registerDateTime);
		
		return msg;
	}

}
