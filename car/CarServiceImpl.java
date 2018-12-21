package car;

public class CarServiceImpl implements CarService{

	@Override
	public CarBean join(String color, String gearType, int door) {
		CarBean carBean = new CarBean();
		carBean.setColor(color);
		carBean.setDoor(door);
		carBean.setGearType(gearType);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gearType() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void door() {
		// TODO Auto-generated method stub
		
	}

}
