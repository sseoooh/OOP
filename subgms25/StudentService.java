package subgms25;
//성적표 학번,이름,과목,점수
public class StudentService {
	public String ShowRecord(String hakbun,
			String name,
			String subjName,
			int score) {
		return String.format("학번: %s\n"
				+ "이름: %s\n"
				+ "과목: %s\n"
				+ "점수: %s\n",hakbun, name, subjName, score);
	}

}

