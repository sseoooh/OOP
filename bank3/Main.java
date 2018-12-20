package bank3;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		while(true) {
			switch(JOptionPane.showInputDialog("[메뉴]\n"
					+ "0.종료\n"
					+ "")) {
			case "0" :
				JOptionPane.showMessageDialog(null, "종료");
				return;
			
			}
		}
	}
}
