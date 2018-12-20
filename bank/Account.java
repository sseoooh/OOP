package bank;
import java.util.Random;
/*
 * 계좌클래스
 * [속성]
 * 상수 : BANK_NAME
 * 멤버변수 : 
 * 1. accountNum 계좌번호
 * 2. money 잔액
 * 3. today 해당일
 *[기능]
 * 1. generationAccountNum() 계좌번호생성(랜덤)
 * 2. today() 해당일생성
 * 3. withdraw() 출금하기
 * 4. deposit() 입금하기
 * 5. info() 계좌정보
 */
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
		
		 
		
		for(int i=0;i<10;i++) {
			if(i==3) {
				accountNum += random.nextInt(9)+"-";
			}else {
				accountNum += random.nextInt(9);
			}
			
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
	/*
	 * 출금하기
	 */
	public void withdraw(int money) {//<-------void가 디폴트다 //블락이없으면 아규먼트
		this.money -= money;
	}
	/*
	 * 입금하기
	 */
	public void deposit(int money) {
		//String a = "";
		this.money += money;
		
	}
public String info1(String name) {
		
		return String.format("은행이름 %s\n"
							+ "계좌번호: %s\n"
							+ "이 름: %s\n"
							+ "날 짜: %s\n"
							+ "잔 액 %s\n", BANK_NAME, accountNum, name, today, money);
}
}