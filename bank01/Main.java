package bank01;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Member member = null;
		while(true){
			switch(JOptionPane.showInputDialog("0.종료 1.회원가입 2.회원정보")) {
			case "0" : 
				JOptionPane.showMessageDialog(null,"종료합니다");
				return;
			case "1" :
			String id = JOptionPane.showInputDialog("아이디");
			String name = JOptionPane.showInputDialog("이름");
			String ssn = JOptionPane.showInputDialog("주민등록번호");
			String pass = JOptionPane.showInputDialog("비밀번호");
			member = new Member(id, name, ssn, pass);
			break;
			case "2" :
			String Member = member.info();
			JOptionPane.showMessageDialog(null, member.info());
			/*
			String info = member.info();
			JOptionPane.showMessageDialog(null, info); 
			 */
			}
		}
	}
}

