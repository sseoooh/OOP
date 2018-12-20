package subgms22;

public class SubjectBean {
	String subjName,profName;
	int score;
	
	public void setSubjName(String subjName) {
		this.subjName = subjName;
	}
	public String getSubjName() {
		return subjName;
	}
	public void setProfName(String profName) {
		this.profName = profName;
	}
	public String getProfName() {
		return profName;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	public String toString() {
		return String.format("[과목정보]\n"
				+ "과목: %s\n"
				+ "교수: %s\n"
				+ "점수: %s",subjName, profName, score  );
	}
	
}
