package gms21;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		StudentBean student = null;
		while(true) {
			/*
			 * 성적표에 표시될 내용 : 학번(Student)
			 * 학생이름(Student)
			 * 과목명(subject)
			 * 점수(subject)
			 */
			switch(JOptionPane.showInputDialog("[메뉴]\n"
												+ "0.종료	\n"
												+ "1.학생부등록\n"
												+ "2.비번변경\n"
												+ "3.학생정보보기\n"
												+ "4.수강과목등록\n"
												+ "5.교수등록\n"
												+ "6.점수등록\n"
												+ "7.성적표보기\n")) {
			case "0" : 
				JOptionPane.showInputDialog(null,"종료");
				return;
			case "1" :
				String hakbun = JOptionPane.showInputDialog("학번");
				String name = JOptionPane.showInputDialog("이름");
				String ssn = JOptionPane.showInputDialog("주민등록번호");
				String pass = JOptionPane.showInputDialog("비밀번호");
				student = new StudentBean();
				student.setHakbun(hakbun);
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
