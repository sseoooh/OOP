package bank11;

public class Member {
	private String id, name, ssn, pass; // 멤버변수
	// 생성자 = 메소드 ->>외부에서 들어온 값을 내부멤버변수에 저장
	public Member(String id,	//메인클래스의 argment를 Member클래스의 파라미터에서 받는다 그리고 다시 this밑의 id에넣고 그게다시 this.id로 들어간다
		   String name,
	       String ssn,
		   String pass){	//소괄호안까지는 파라미터
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.pass = pass;
	}
	public void setPass(String pass) {	 //setter 셰터 값을받아 바꿀때
		this.pass = pass;//void는 default와 비슷,return값이없으니까
	}
	public String getPass() { // getter 게터는 있는 그대로의 값을 보여줄때
		return pass;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSsn() {
		return ssn;
	}
	public String toString() {	//멤버 메소드
		
		return String.format("[회원정보]\n"
							+ "ID: %s\n"
							+ "이름: %s\n"
							+ "주민번호: %s\n"
							+ "비밀번호: %s", id, name, ssn, pass);
	}
}
