package bankexercise;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
		Bean bean = null;
		Service service = new ServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog(
					"0.종료\n"
					+ "1.회원가입 2.계좌보기 3. 4.입금 5.출금 6.비번변경 7.회원정보보기 8.회원목록 9.아이디검색 10.로그인")) {
				case "0":
					JOptionPane.showMessageDialog(null,
							"종료 ..");
					return;
				case "1" :
					service.join(
							JOptionPane.showInputDialog("ID등록"),
							JOptionPane.showInputDialog("이름등록"),
							JOptionPane.showInputDialog("주민번호등록"),
							JOptionPane.showInputDialog("비번등록"));
					break;
				case "7" :
					JOptionPane.showMessageDialog(null, bean.toString());
					break;	
				case "8" :
					Bean[] beans = service.list();
					JOptionPane.showMessageDialog(null, beans);
					break;
				case "9" :
					String id = JOptionPane.showInputDialog("검색할 아이디입력");
					JOptionPane.showMessageDialog(null, service.find(id));
					break;
				case "10" :
					
					break;
			}
		}
	}
}
