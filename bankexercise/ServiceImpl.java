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
	public Bean[] list() {
		// TODO Auto-generated method stub
		return beans;
		
	}

	@Override
	public Bean find(String id) {
		Bean bean = new Bean();
		for(int i=0;i<count;i++) {
			if(beans[i].getId().equals(id)) {
				bean = beans[i];
				break;
			}
		}
		// TODO Auto-generated method stub
		return bean;
	}

	@Override
	public boolean login(String id, String pw) {
		// TODO Auto-generated method stub
		boolean ok = false;
		for(int i =0;i<count;i++) {
			if(beans[i].getId().equals(id) && beans[i].getId().equals(pw)) {
				ok = true;
			}
		}
	return ok;
		
		
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
