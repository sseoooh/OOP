package card;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
		CardBean cardBean = null;
		CardService cardService = new CardServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog("[메뉴]\n"
												+ "0.종료	\n"
												+ "1.카드선택\n"
												+ "2.카드정보\n"
												)) {
			case "0" : 
				JOptionPane.showMessageDialog(null,"종료");
				return;
			case "1" :
				cardBean = cardService.info(
						JOptionPane.showInputDialog("카드의종류"),
						Integer.parseInt(JOptionPane.showInputDialog("카드번호")));
				/*카드의종류
				  카드번호
				 */
				break;
			case "2" :
				JOptionPane.showMessageDialog(null, cardBean.toString());
				//제출한 카드의 스펙
				break;
			}
		}
	}
}