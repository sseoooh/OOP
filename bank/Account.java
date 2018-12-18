package bank;
import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Account {
	final static String BANK_NAME = "국민은행"; //상수 -필드에서는 무조건 static을 넣어라
		String accountNum;
		int money;
		String today;
		Account(int money){
		this.accountNum = this.generatorAccountNum();
		this.money = money;
		this.today = this.today();
	}
	public String generatorAccountNum() {
		String accountNum = "";
		Random random = new Random();
		int[] rn = new int[10];
		String res ="";
		for(int i=0;i<10;i++) {
			rn[i] = random.nextInt(10);
			if(i<4) {
				res += i+"";
			}else if(i==4) {
				res += "-";
			}else if(i<10){
				res += i+"";
			}
			 accountNum = res;
		}
		//1234-5678
		return accountNum;
	}
	public String today() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		today = sdf.format(date);
		return today;
	}
	
	
public String info1(String name) {
		
		return String.format("은행이름 %s\n"
							+ "계좌번호: %s\n"
							+ "이 름: %s\n"
							+ "날 짜: %s\n"
							+ "잔 액 %s\n", BANK_NAME, accountNum, name, today, money);
	
}
}