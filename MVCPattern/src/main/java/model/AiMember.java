package model;

public class AiMember {

	// 사용자가 입력한 데이터 저장
	// Model - DTO(Data Transfer Object), VO(Value Obeject)
	
	// 1. 필드(테이블의 컬럼들)
	private String id;
	private String pw;
	private String name;
	private int age;

	
	// 2. 메소드
	// -> 생성자는 만들지 않고, getter setter 메소드만 만들기!
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	
	
}
