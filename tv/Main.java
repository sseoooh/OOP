package tv;

import javax.swing.JOptionPane;

import gms21.StudentBean;

public class Main {
	

	public static void main(String[] args) {
		while(true) {
			switch(JOptionPane.showInputDialog("[메뉴]\n"
												+ "0.종료	\n"
												+ "1.TV작동\n"
												+ "2.TV정보\n"
												)) {
			case "0" : 
				JOptionPane.showInputDialog(null,"종료");
				return;
			case "1" :
				/*brand, color, price;
				TV브랜드
				TV색상
				가격
				*/
				break;
			case "2" :
				//구입한 TV스펙
				break;
			}
		}
	}
}
	
