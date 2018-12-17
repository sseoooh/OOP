package real;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		while(true) {
			String menu = JOptionPane.showInputDialog(
							"0.종료\n"
							+"1.회원관리\n"
							+"2. 계산기 \n"
							+"3. 로또\n"
							+"4. 달력 \n");
			switch(menu) {
			case "0" :
			JOptionPane.showMessageDialog(null,"시스템종료");
			return;
			
			case "1" :
				Member m = new Member();
				String name = JOptionPane.showInputDialog("이름입력");
				m.name = name;
				JOptionPane.showMessageDialog(null,
						String.format("환영합니다 %s 님",  m.name));
				
				String mMenu = JOptionPane.showInputDialog("[회원관리 메뉴]\n"
											+ "1. BMI(키, 몸무게) \n"
											+ "2. 학점(국어, 영어, 수학, 과학, 사회) \n"
											+ "3. 성별체크(SSN)");
				
				switch(mMenu) {
					case "1" :
						String[] arr = JOptionPane.showInputDialog(null,
									"몸무게, 키 입력").split(",");
						String bmi = m.bmi(Double.parseDouble(arr[0]),Double.parseDouble(arr[1]));
						JOptionPane.showMessageDialog(null,
							String.format("%s 님은 %s 입니다.", m.name,bmi));
						break;
				
					case "2" :
						String score = JOptionPane.showInputDialog(null,
							"국어,영어,수학,과학,사회 점수 입력");
						String[] arr3 = score.split(",");
						String grade = m.grade(arr3);
						JOptionPane.showMessageDialog(null,
							String.format("%s님은%s입니다",name,grade));
						break;
						
					case "3" :
						String number = JOptionPane.showInputDialog(null,"주민등록번호를 입력하세요");
						String res =m.genderChecker(number);
						JOptionPane.showMessageDialog(null,
								String.format("%s님은%s입니다",name,res));
				}
				
			
				
				
			
			
			}
		}
		
		
		
	}
}
