package bank7;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		while(true) {
			switch(JOptionPane.showInputDialog("[메뉴]0.종료"
					+ "1. 회원가입")) {
			case "0" : 
				JOptionPane.showMessageDialog(null, "종료");
				return;
			}
		}
	}
}
