package bank1;

public class Member {
	String id, name, ssn, pass;		//클래스바로밑은 값을 안넣어줘되된다 여기만!	//<--- 멤버변수 or 인스턴스변수를 선언!	
	Member(String id, String name, String ssn, String pass){	//멤버변수를 초기화하기위에 멤버변수밑에 바로 정의해준다 this부분까지
			this.id = id; 										//위에멤버변수는 .으로 접근할수없기때문에 this를 써준다
			this.name = name; 									//지역변수가 밤색 // Member()부터 생성자를 생성함
			this.ssn = ssn;										
			this.pass = pass;
	}
	/**
	 *회원정보 보여주기 
	 **/
	public String info() { //리턴타입이 답이다(여기서는 String)
		String info = String.format("[회원정보]\n"
				+ "id는 %s\n"
				+ "이름은 %s\n"
				+ "주민등록번호는 %s\n"
				+ "비밀번호는 %s\n",id,name,ssn,pass);
		
		return info;
	}
	}

