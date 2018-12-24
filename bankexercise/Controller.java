package bankexercise;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
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
					//service.join(id, name, pass, ssn);
					break;
				case "7" :
					
					break;	
				case "8" :
					
					break;
				case "9" :
					
					break;
				case "10" :
					
					break;
			}
		}
	}
}
