package car;
import javax.swing.JOptionPane;
public class Controller {
	public static void main(String[] args) {
		CarBean carBean = null;
		CarService carService = new CarServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n1.차량입고\n2.차량목록\n3.차량판매")) {
			case "0" : 
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1" :
				String brand = JOptionPane.showInputDialog("브랜드");
				String color =JOptionPane.showInputDialog("색깔");
				String gearType = JOptionPane.showInputDialog("기어타입");
				String door = JOptionPane.showInputDialog("문갯수");
				carService.add(brand, color, gearType, Integer.parseInt(door));
				/*brand, color, price 입력함
				 * car 브랜드
				 * car 색상
				 * 가격
				 * */
				break;
			case "2" :
				carService.list();
				//구입한 car 스펙
				break;
			case "3" :
				carService.find();
				break;
			case "4" :
				carService.sell();
				break;
			}
		}
	}
}