package subgms25;

public class SubjectBean {
	String subjName,profName;
	public void setSubjName(String subjname) {
		this.subjName = subjname;
	}
	public String getSubjName() {
		return subjName;
	}
	public void setProfName(String profname) {
		this.profName = profname;
	}
	public String getProfName() {
		return profName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("과목: %s\n"
				+ "교수: %s\n",subjName, profName);
	}
}
