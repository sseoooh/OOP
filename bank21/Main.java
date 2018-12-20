package bank21;
import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
		
		while(true) {
			
			switch(JOptionPane.showInputDialog(
					"0.종료\n"
					+ "1.회원가입 2.계좌개설 3.계좌보기 4.입금 5.출금 6.비번변경 7.회원정보보기")) {
				
				case "0":
					JOptionPane.showMessageDialog(null,
							"종료 ..");
					return;
				
			}
		}
	}
}
