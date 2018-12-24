package card;
//모든것은 Bean에의해서 결정된다
public class CardBean {
	private String kind; // 카드종류 : 스페이드, 다이아, 하트, 클로버
	private int number;
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("카드종류: %s\n"
				+ "카드번호: %d\n",kind, number);
	}
}
