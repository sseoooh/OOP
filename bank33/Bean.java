package bank33;

public class Bean {
	private String name, ssn, pass;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPass() {
		return pass;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("이름: %s\n"
				+ "주민등록번호: %s\n"
				+ "비밀번호 : %s\n",name, ssn, pass);
	}
	
}
