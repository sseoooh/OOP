package bank32;

import javax.swing.JOptionPane;


public class Controller {
public static void main(String[] args) {
	while(true) {
		switch(JOptionPane.showInputDialog("[메뉴]\n0.종료\n"
				+ "1.회원가입")) {
		
		case "0" : 
			JOptionPane.showMessageDialog(null, "종료");
			return;
		case "1" :
			break;
		
		}
	}
}
}
