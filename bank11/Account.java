package bank11;											//getter setter하는것이 은닉화라고한다(private public)
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
	public final static String BANK_NAME = "국민은행"; //상수 -필드에서는 무조건 static을 넣어라  //보안대상아님
		private String accountNum, today;
		private int money;//타입이 다르니까 String이랑 따로놓음
		
		public void setAccountNum(String accountNum) {
			this.accountNum = accountNum;
		}
		
	public String accountNum() {;  //한번 개통한 계좌니까 바뀌면 안된다
		return accountNum;
	}
	public void setTdoay(String today) {
		this.today = today;
	}
	public String getToday() {	//get으로 붙인것은 변수던지고
		return today;
	}
	public void setMoney(int money) {//외부에서 돈을 받아야하기때문에 //set은 받고끝내고
		this.money = money; 		//잔고를 현재의 값으로 바꾼다
	}	
	public int getMoney() {
		return money;
	}
	
	
public String toString() {
		
		return String.format("은행이름 %s\n"
							+ "계좌번호: %s\n"
							+ "이 름: %s\n"
							+ "날 짜: %s\n"
							+ "잔 액 %s\n", BANK_NAME, accountNum, today, money);
}
}