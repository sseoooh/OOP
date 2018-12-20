package bank01;
import java.util.Random;
public class Account {
	String accountNum, today;
	int money;
	Account(int money){//외부에서 계좌는 받으면 안되니 지움
		this.accountNum = makeAccountNum();
		this.today = this.makeToday();
		this.money = money;
	}
	public String makeAccountNum() {
		String accoutNum="";
		Random random = new Random();
		int[] rn = new int[10];
		return accountNum;
	}
	public String makeToday() {
		String today="";
		return today;
	}
	
	public String info() {
		String info = "";
		return info;
	}
}
