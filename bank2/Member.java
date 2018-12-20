package bank2;

public class Member {
	String id, name, ssn, pass;
	Member(
			String id,
			String name,
			String ssn,
			String pass){
		
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.pass = pass;
	}
	public String info() {
		return String.format("id는%s"
				+ "name은%s"
				+ "ssn은%s"
				+ "pass는%s",id,name,ssn,pass);
	}

	}

