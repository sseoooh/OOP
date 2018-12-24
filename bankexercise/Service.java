package bankexercise;

public interface Service {
	public void join(String id, String name, String pass, String ssn);
	public Bean[] list();
	public Bean find(String id);
	public boolean login(String id, String pw);
	public void count();
	public void update();
	public void delete();
}
