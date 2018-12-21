package bank32;

public class AccountBean {
	String accountNum,today;
	int money;
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setToday(String today) {
		this.today = today;
	}
	public String getToday() {
		return today;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format(
				"계좌번호: %s\n"
				+ "시간: %s\n"
				+ "잔고: %s\n",accountNum, today, money);
}
}

