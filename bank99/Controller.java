package bank99;

import javax.swing.JOptionPane;

public class Controller {
	
	public static void main(String[] args) {
		AccountBean account = null; //값이 없어야 만들수있기때문에 null, 공간만 만들어줌
		MemberBean member = null; //과거에는 한명정보가 member에 저장됐지만 ServiceImpl에서 저장된다
		AccountService accountService = new AccountServiceImpl();
		MemberService memberService = new MemberServiceImpl(); //while돌기전에 이미 회원값10번돌고 배열이 만들어짐 while실행된다
		while(true) {
			switch(JOptionPane.showInputDialog(
					"0.종료\n"
					+ "1.회원가입 2.계좌보기 3. 4.입금 5.출금 6.비번변경 7.회원정보보기 8.회원목록 9.아이디검색 10.로그인")) {
				case "0":
					JOptionPane.showMessageDialog(null,
							"종료 ..");
					return;
				case "1": // 회원가입
					memberService.join( //controller가 ServiceImpl한테 date를 준것
							JOptionPane.showInputDialog("ID등록"), 
							JOptionPane.showInputDialog("이름 등록"), 
							JOptionPane.showInputDialog("주민번호 등록"), 
							JOptionPane.showInputDialog("비번 등록")
							);
					break;
				case "2":
					JOptionPane.showMessageDialog(null,member.toString());
					break;
				case "3":
					break;
				case "4":
					String inputMoney = JOptionPane.showInputDialog("입금액");
					//String message = account.deposit(Integer.parseInt(inputMoney));
					//JOptionPane.showMessageDialog(null, message);
					break;
				case "5":
					String outputMoney = JOptionPane.showInputDialog("출금액");
					//String message2 = account.withdraw(Integer.parseInt(outputMoney));
					//JOptionPane.showMessageDialog(null, message2);
					break;
				case "6":
					String changePass = JOptionPane.showInputDialog("바꿀 비번 입력");
					member.setPass(changePass);
					break;
				case "7":
					JOptionPane.showMessageDialog(null,member.toString() );
					break;
				case "8":
					
					break;
				case "9" :
					
					break;
				case "10" :
					
					break;
			}
		}
	}
}