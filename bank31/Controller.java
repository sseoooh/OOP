package bank31;

import javax.swing.JOptionPane;

public class Controller {
	
	public static void main(String[] args) {
		//여기 밑에서 assignment가 가능한 이유는 메인메소드 안에서기때문 뒤에 serviceImpl 봐바라
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
					memberService.join( //Impl한테 값을 보내는 부분
							JOptionPane.showInputDialog("ID등록"), 
							JOptionPane.showInputDialog("이름 등록"), 
							JOptionPane.showInputDialog("주민번호 등록"), 
							JOptionPane.showInputDialog("비번 등록"));
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
					MemberBean[] members = memberService.list();
					JOptionPane.showMessageDialog(null, members);
					
					/*String temp = "";
					for(int i=0; i<members.length;i++) {
						temp += members[i]+"\n";
					}*/
					
					JOptionPane.showMessageDialog(null,members);
					break;
				case "9" :
					String id = JOptionPane.showInputDialog("검색할아이디입력");
					JOptionPane.showMessageDialog(null, memberService.find(id));
					break;
				case "10" :
					id = JOptionPane.showInputDialog("로그인 아이디");
					String pw = JOptionPane.showInputDialog("로그인 비번");
					boolean ok = memberService.login(id, pw);
					if(ok) {				//바로결과값받을수있는이유는 boolean이기때문에
						JOptionPane.showMessageDialog(null, "로그인 성공");
					}else {
						JOptionPane.showMessageDialog(null, "로그인 실패");
					}
					//JOptionPane.showMessageDialog(null, (ok) ? "로그인성공" : "로그인실패");
					break;
			}
		}
	}
}