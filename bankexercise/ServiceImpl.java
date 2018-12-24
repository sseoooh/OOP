package bankexercise;

public class ServiceImpl implements Service{
	private Bean[] beans;
	private int count;
	ServiceImpl(){
		this.beans = new Bean[10];
		this.count = 0;
	}

	@Override
	public void join(String id, String name, String pass, String ssn) {
		// TODO Auto-generated method stub
		Bean bean = new Bean();
		bean.setId(id);
		bean.setName(name);
		bean.setPass(pass);
		bean.setSsn(ssn);
		beans[count] = bean; 
		count++;
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void count() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
