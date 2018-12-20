package subgms24;

import javax.swing.JOptionPane;

import subgms22.SubjectService;

public class Main {
	public static void main(String[] args) {
		StudentBean student=null;
		SubjectBean subjnamebean=null;
		StudentService studentService =  new StudentService();
		SubjectService subjectService = new SubjectService();
		while(true) {
			switch(JOptionPane.showInputDialog("[메뉴]\n"
					+ "0.종료	\n"
					+ "1.학생부등록\n"
					+ "2.비번변경\n"
					+ "3.학생정보보기\n"
					+ "4.과목,교수,학점\n"
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
			student.setHakBun(hakbun);
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
			String profName = JOptionPane.showInputDialog("교수");
			String score = JOptionPane.showInputDialog("학점");
			subjnamebean = new SubjectBean();
			subjnamebean.setSubjName(subjName);
			subjnamebean.setprofName(profName);
			subjnamebean.setScore(Integer.parseInt(score));
			break;
			case "5" :
			
			String recode = subjectService.showRecord(student.getHakBun(),
					student.getName(),subjnamebean.getsubjName(),subjnamebean.getScore());
			JOptionPane.showMessageDialog(null, recode);
			break;
			
			
			
			
			
			
			}
		}
	}
}
