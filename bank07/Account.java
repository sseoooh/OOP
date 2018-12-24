package bank07;

public class Account {
	final static String BANK_NAME = "국민은행";
	String accountNum, today;
	int money;
	Account(int money){
		this.accountNum = generatorNum();
		this.today = today();
		this.money = money;
	}
	public String generatorNum() {
		String generatorNum ="";
		return generatorNum;
	}
	public String today() {
		String today ="";
		return today;
	}
	public void info() {}
}
