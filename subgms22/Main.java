package subgms22;

import javax.swing.JOptionPane;

import gms01.Student;

public class Main {
	public static void main(String[] args) {
		StudentBean student = null;
		SubjectBean subject = null;
		SubjectService subjectService = new SubjectService();
		while(true) {
			switch(JOptionPane.showInputDialog("[메뉴]\n"
					+ "0.종료	\n"
					+ "1.학생부등록\n"
					+ "2.비번변경\n"
					+ "3.학생정보보기\n"
					+ "4.과목,교수,점수\n"
					+ "5.성적표보기\n")) {
			//성적표 학번,이름,과목,점수
			case "0" : JOptionPane.showMessageDialog(null, "종료");
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
				String subjName = JOptionPane.showInputDialog("과목명");
				String profName = JOptionPane.showInputDialog("교수이름");
				String score = JOptionPane.showInputDialog("점수");
				subject = new SubjectBean();
				subject.setProfName(profName);
				subject.setScore(Integer.parseInt(score));
				subject.setSubjName(subjName);
				break;
			case "5" :
				String record = subjectService.showRecord(student.getHakbun(), student.getName(), subject.getSubjName(), subject.getScore());
				JOptionPane.showMessageDialog(null,record);
				break;
			case "6" : 
				break;
			case "7" : 
				break;
			}
		}
	}
}
