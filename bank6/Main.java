package bank6;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		while(true) {
			switch(JOptionPane.showInputDialog("[메뉴] 0.종료\n"
					+ "1.회원가입")) {
			case "0" : 
				JOptionPane.showInputDialog("종료");
				return;
			case "1" :
				
				break;
			
			}
		}
	}
}
