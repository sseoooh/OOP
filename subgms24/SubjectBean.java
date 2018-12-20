package subgms24;

public class SubjectBean {
	private String subjName,profName;
	int score;
	public void setSubjName(String subjName) {
		this.subjName = subjName;
	}
	public String getsubjName() {
		return subjName;
	}
	public void setprofName(String profName) {
		this.profName = profName;
	}
	public String getprofName() {
		return profName;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	@Override
	public String toString() {
		
		return String.format("과목명: %s\n"
				+ "교수: %s\n"
				+ "학점: %s",subjName, profName, score);
	}
}
