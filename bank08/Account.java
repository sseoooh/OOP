package bank08;

public class Account {
	String accountNum;
	int money;
	String today;
	Account(String accountNum,
			String today,
			int money){
		this.accountNum = accountNum;
		this.today = today;
		this.money = money;
	}
	public String info() {
		return String.format("계좌번호: %s\n"
				+ "시간: %s\n"
				+ "잔고: %d",accountNum,this.today,this.money);
	}
}
