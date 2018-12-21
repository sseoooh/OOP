package bank03;

public class Account {
	final static String BANK_NAME = "국민은행";
	String money, today, accountNum;
	Account(String money){
		this.money = money;
		this.today = this.today();
		this.accountNum = this.generatorAccountNum();
	}
	public String generatorAccountNum() {
		String accountNum = "";
		return accountNum;
	}
	public String today() {
		String today = "";
		return today;
	}
	public void withdraw() {}
	public void deposit() {}
	public String info() {
		String info = "";
		return info;
	}
}
