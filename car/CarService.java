package car;
/*
 * String color, gearType;
	private int door; //문의갯수
 */
public interface CarService {
	/*
	 * 판매할 차량을 입고시킨다
	 */
	public abstract void add(String brand, String color, String gearType, int door);  //argment는 타입써줘야함 ex:String int
	public void list();
	public void find();
	public void sell();
}
