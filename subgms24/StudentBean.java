package subgms24;

public class StudentBean {
	private String hakbun, name, ssn, pass;
	public void setHakBun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getHakBun() {
		return hakbun;
	}
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
	public String getpass() {
		return pass;
	}
	@Override
	public String toString() {
		
		return String.format("학번: %s\n"
				+ "이름: %s\n"
				+ "주민등록번호: %s\n"
				+ "비밀번호: %s\n",hakbun, name, ssn, pass);
	}
}
