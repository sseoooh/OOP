package bank06;

public class Account {
	final static String BANK_NAME = "국민은행";
	String accountNum; String today; int money;
	Account(int money){
		this.accountNum = this.generatorNum();
		this.money = money;
		this.today = this.today();
	}
	public String generatorNum() {
		String generatorNum = "";
		return generatorNum;
	}
	public String today() {
		String today = "";
		return today;
	}
	public String info() {
		String info="";
		return info;
	}
}
