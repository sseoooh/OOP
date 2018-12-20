package bank4;

public class Account {
	final static String BANK_NAME = "국민은행";
	String money, today, accountNum;
	Account(String money){
		this.money = money;
		this.today = this.today();
		this.accountNum = this.generatorAccountNum();
	}
	/*
	 * generatorAccountNum()
today()
withdraw()
deposit()
info()
	 */
	public String generatorAccountNum() {
		String account = "";
		return account;
	}
	public String today() {
		String today = "";
		return today;
	}
	public void withdraw() {}
	public void accountNum() {}
	public String info() {
		return String.format("[은행이름 %s\n"
				+ "계좌번호 %s"
				+ "날짜 %s"
				+ "잔액 %s", BANK_NAME, accountNum, today, money);
	}
}
