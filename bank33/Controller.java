package bank33;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
		Bean bean = null;
		Service service = new ServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog("[메뉴]\n0.종료\n"
					+ "1.개인정보입력"
					+ "2.정보보기")) {
			case "0" : 
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1" :
				bean = service.info(
						JOptionPane.showInputDialog("이름"),
						JOptionPane.showInputDialog("주민등록번호"),
						JOptionPane.showInputDialog("비밀번호"));
				break;
			case "2" :
				JOptionPane.showMessageDialog(null, bean.toString());
				break;
			}
		}
	}
}
