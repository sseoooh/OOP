package subgms23;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		StudentBean student = null;
		while(true) {
			switch(JOptionPane.showInputDialog("[메뉴]\n0.종료\n"
					+ "1.회원정보입력하기"
					+ "3.회원정보보기")) {
		case "0" :
			JOptionPane.showMessageDialog(null, "종료");
			return;
		case "1" : 
			String hakbun = JOptionPane.showInputDialog("학번");
			String name = JOptionPane.showInputDialog("이름");
			String ssn = JOptionPane.showInputDialog("주민등록번호");
			String pass = JOptionPane.showInputDialog("비밀번호");
			
			student= new StudentBean();
			student.sethakBun(hakbun);
			student.setName(name);
			student.setPass(pass);
			student.setSsn(ssn);
			break;
		case "2" : 
			break;
		case "3" : 
			JOptionPane.showMessageDialog(null, student.toString());
			break;
		case "4" : 
			break;
		case "5" : 
			break;
		case "6" : 
			break;
		case "7" : 
			break;
			
			}
		}
			
	}
}
