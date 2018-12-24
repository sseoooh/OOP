package car;

public class CarBean {
	private String brand ,color, gearType;
	private int door; //문의갯수
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setGearType(String geartype) {
		this.gearType = geartype;
	}
	public String getGearType(String geartype) {
		return geartype;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public int getDoor() {
		return door;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("브랜드: %s\n"
				+ "색깔:"
				+ "기어종류: %s\n"
				+ "문의갯수: %s\n",brand, color, gearType, door);
	}
	
}
