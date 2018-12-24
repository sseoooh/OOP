package bankexercise;

public interface Service {
	public void join(String id, String name, String pass, String ssn);
	public void list();
	public void find();
	public void login();
	public void count();
	public void update();
	public void delete();
}
