package car;
/*
 * String color, gearType;
	private int door; //문의갯수
 */
public interface CarService {
	public CarBean join(String color, String gearType, int door);
	
	public void color();
	public void gearType();
	public void door();
}
