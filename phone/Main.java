package phone;

import javax.swing.JOptionPane;

public class Main { //Main은 has-a관계
	public static void main(String[] args) {
		PhoneBean phone = null;
		CelPhoneBean celPhone = null;
		IPhoneBean iPhone = null;
		AndroidPhoneBean aPhone = null;
		while(true) {
			switch(JOptionPane.showInputDialog("[메뉴]\n"
					+ "0.종료	\n"
					+ "1.일반폰\n"
					+ "2.휴대폰\n"
					+ "3.아이폰\n"
					+ "4.안드로이드\n"
					+ "5.\n")) {
			//성적표 학번,이름,과목,점수
			case "0" : JOptionPane.showMessageDialog(null, "종료");
			return;
			case "1" : 
				phone = new PhoneBean();
				String company = JOptionPane.showInputDialog("어느회사제품"); // 금성
				String call = JOptionPane.showInputDialog("통화내용"); //안녕
				String kind = JOptionPane.showInputDialog("종류");
				phone.setCompany(company);
				phone.setCall(call);
				phone.setKind(kind);
				JOptionPane.showMessageDialog(null, phone.toString());
				/* 종류 : 일반전화기
				 * 제조사 : 금성
				  통화내용 : 안녕*/
				break;
			case "2" :
				celPhone = new CelPhoneBean();
				company = JOptionPane.showInputDialog("어느회사제품"); // 금성
				call = JOptionPane.showInputDialog("통화내용"); //안녕
				String move = JOptionPane.showInputDialog("이동가능");
				kind = JOptionPane.showInputDialog("종류");
				celPhone.setCompany(company);
				celPhone.setCall(call);
				celPhone.setMove(move);
				celPhone.setKind(kind);
				JOptionPane.showMessageDialog(null, celPhone.toString());
				/* 종류 : 휴대폰
				 * 제조사 : 모토로라
				 * 이동성  : 이동가능함
				  통화내용 : 안녕*/
				break;
			case "3" :
				iPhone = new IPhoneBean();
				kind = JOptionPane.showInputDialog("종류");
				company = JOptionPane.showInputDialog("어느회사제품"); // 금성
				move = JOptionPane.showInputDialog("이동가능");
				String date = JOptionPane.showInputDialog("검색");
				iPhone.setCompany(company);
				iPhone.setMove(move);
				iPhone.setKind(kind);
				iPhone.setDate(date);
				JOptionPane.showMessageDialog(null, iPhone.toString());
				/* 종류 : 아이폰
				 * 제조사 : 애플
				 * 이동성  : 이동가능함
				 * 검색 : 노래검색
				 */
				break;
			case "4" :
				aPhone= new AndroidPhoneBean();
				kind = JOptionPane.showInputDialog("종류");
				company = JOptionPane.showInputDialog("어느회사제품"); // 금성
				move = JOptionPane.showInputDialog("이동가능");
				String display = JOptionPane.showInputDialog("몇인치");
				date = JOptionPane.showInputDialog("검색");
				aPhone.setKind(kind);
				aPhone.setCompany(company);
				aPhone.setMove(move);
				aPhone.setDisplay(display);
				aPhone.setDate(date);
				JOptionPane.showMessageDialog(null, aPhone.toString());
				/* 종류 : 갤노트
				 * 제조사 : 삼성
				 * 이동성  : 이동가능함
				 * 디스플레이 : 6인치
				 * 검색 : 영화
				 */
				break;
			}
		}
	}
}
