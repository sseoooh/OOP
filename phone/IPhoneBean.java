package phone;

public class IPhoneBean extends CelPhoneBean {
	private String date;
	public void setDate(String date) {
		this.date = date;
	}
	public String getDate() {
		return date;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("종류 %s\n"
				+ "제조사 %s\n"
				+ "이동성 %s\n"
				+ "검색", super.getKind(), super.getCompany(), super.getMove(), date);
	}
}
