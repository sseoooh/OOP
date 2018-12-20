package bank2;

public class Account {
	final static String BANK_NAME ="국민은행";
	String accountNum;
	int money;
	String today;
	
	Account(int money){
		this.accountNum = this.accountNum();
		this.money = money;
		this.today = this.today();
	}
	public String accountNum() {
		String accountNum="";
		
		return accountNum;
	}
	public String today() {
		String today="";
		return today;
	}
	public void withdraw() {}
	public void deposit() {}
	public String info(String name) {
		String info=String.format("은행이름%s\n"
				+ "계좌번호:\n"
				+ "이름 : %s\n"
				+ "날짜 :%s\n"
				+ "잔액 :%s\n", BANK_NAME, accountNum, name,  today);
		return info;
	}
}
