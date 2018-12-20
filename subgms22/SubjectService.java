package subgms22;

public class SubjectService {
	public String showRecord(String hakbun,
			String name,
			String subjName,
			int score) {
		return String.format("학번: %s\n"
				+ "이름: %s\n"
				+ "과목명: %s\n"
				+ "점수 %s",hakbun, name, subjName, score);
	}
}
