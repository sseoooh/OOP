package bank08;

public class Member {
	String id, pass, ssn, address;
	Member(String id,
			String pass,
			String ssn,
			String address){
		this.id = id;
		this.pass = pass;
		this.ssn = ssn;
		this.address = address;
	}
	public String info() {
		return String.format("아이디는 %s"
				+ "비밀번호는%s",id,pass);
	}
	
}
