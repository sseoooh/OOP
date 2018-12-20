package card;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		while(true) {
			switch(JOptionPane.showInputDialog("[메뉴]\n"
												+ "0.종료	\n"
												+ "1.카드선택\n"
												+ "2.TV정보\n"
												)) {
			case "0" : 
				JOptionPane.showInputDialog(null,"종료");
				return;
			case "1" :
				/*카드의종류
				  카드번호
				 */
				break;
			case "2" :
				//제출한 카드의 스펙
				break;
}
}
	}
}