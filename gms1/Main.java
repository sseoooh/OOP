package gms1;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		while(true) {
			switch(JOptionPane.showInputDialog("[메뉴]\n"
												+ "0.종료	\n"
												+ "1.학번\n"
												+ "2.이름\n"
												+ "3.주민등록번호"
												+ "4.비밀번호")) {
			case "0" : 
				JOptionPane.showInputDialog(null,"종료");
				return;
			case "1" : 
				String hakbun = JOptionPane.showInputDialog("학번을 입력하세요");
				String name = JOptionPane.showInputDialog("이름을 입력하세요");
				String ssn = JOptionPane.showInputDialog("주민등록번호를 입력하세요");
				String pass = JOptionPane.showInputDialog("비밀번호를 입력하세요");
				Student student = new Student(hakbun, name, ssn, pass);
				JOptionPane.showMessageDialog(null, student.info());
			break;
				
			}
		}
	}
}
