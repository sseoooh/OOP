package bank33;

public class ServiceImpl implements Service{

	@Override
	public Bean info(String name, String ssn, String pass) {
		Bean bean = new Bean();
		bean.setName(name);
		bean.setSsn(ssn);
		bean.setPass(pass);
		// TODO Auto-generated method stub
		return bean;
	}

}
