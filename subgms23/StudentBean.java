package subgms23;

public class StudentBean {
	String hakbun, name, ssn, pass;
	
	public void sethakBun(String hakbun) {
		this.hakbun= hakbun;
	}
	public String gethakBun() {
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
	public void setPass(String pass){
		this.pass = pass;
	}
	public String getPass() {
		return pass;
	}
	public String toString() {
		return String.format("학번은 %s"
				+ "이름은 %s"
				+ "주민등록번호는 %s"
				+ "비밀번호는 %s",hakbun,name,ssn,pass);
	}
}
