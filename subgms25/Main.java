package subgms25;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		StudentBean studentBean = null;
		StudentService service = new StudentService();
		SubjectBean subjectBean = null;
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
				studentBean = new StudentBean();
				studentBean.setHakbun(hakbun);
				studentBean.setName(name);
				studentBean.setPass(pass);
				studentBean.setSsn(ssn);				
				break;
			case "2" :
				break;
			case "3" :
				JOptionPane.showMessageDialog(null,studentBean.toString());
				break;
			case "4" :
				subjectBean = new SubjectBean();
				String subjName = JOptionPane.showInputDialog("과목");
				String profName = JOptionPane.showInputDialog("교수");
				String score = JOptionPane.showInputDialog("학점");
				subjectBean.setSubjName(subjName);
				subjectBean.setProfName(profName);
				subjectBean.setScore(Integer.parseInt(score));
			break;
			case "5" :
				String record = service.ShowRecord(studentBean.getHakbun(),
						studentBean.getName(),subjectBean.getSubjName(), subjectBean.getScore());//여기서왜 student로 바뀌는가?
				JOptionPane.showMessageDialog(null, record);
			break;
			}
		}
	
}
}