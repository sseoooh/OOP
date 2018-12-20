package bank02;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		while(true) {
			switch(JOptionPane.showInputDialog("[메뉴]\n 0.종료\n"
					+ "1.회원가입\n"
					+ "2.계좌개설\n"
					+ "3.계좌보기\n")) {
			case "0" :
				JOptionPane.showMessageDialog(null,"종료");
				break;
			case "1" :
				String id = JOptionPane.showInputDialog("아이디를 입력하세요");
				String name = JOptionPane.showInputDialog("이름을 입력하세요");
				String ssn = JOptionPane.showInputDialog("주민등록번호를 입력하세요");
				String pass = JOptionPane.showInputDialog("비밀번호를 입력하세요");
				Member member = new Member(id, name, ssn, pass);
				JOptionPane.showMessageDialog(null, member.info());
				break;
			case "2" :
				
			
			}
		}
	}
}
