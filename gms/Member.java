package gms;

public class Member {
	String name; // 멤버변수는 초기화하면 안된다 
	
	public String bmi(double weight, double height) {		//bmi결과는 문자니까 String
		String bmi = "";	//지역변수 -> 로컬변수
		
		double ave = weight/((height*height)/10000);
		
		if(ave>40) {
			bmi = "고도비만";
		}else if(ave>35) {
			bmi = "중등도비만";
		}else if(ave>30) {
			bmi = "경도비만";
		}else if(ave>25) {
			bmi = "과체중";
		}else if(ave>18.5) {
			bmi = "정상";
		}else if(ave<18.4) {
			bmi = "저체중";
		}
		return bmi;
									//return String.format("%s은 %f : %s이다",name,ave,bmi);
	}								// bmi end
	public String grade(String[] arr3) {
		String grade = ""; // 지역변수(로컬변수)는 반드시 초기화 해야한다. 원치않는 갑이 할당됨
		/*
		 국어, 영어, 수학, 과학, 사회 과목 점수를 입력 받아서 평균을 낸뒤
		 100 ~90 A, B, C, D, E, F 를 내는 것
		 */
		
	
		double kor = Double.parseDouble(arr3[0]);
		double eng = Double.parseDouble(arr3[1]);
		double mat = Double.parseDouble(arr3[2]);
		double sci = Double.parseDouble(arr3[3]);
		double soe = Double.parseDouble(arr3[4]);
		double all = kor+eng+mat+sci+soe;
		double ave = all/5;
		if(ave>90) {
			grade = "A";
		}else if(ave>80) {
			grade = "B";
		}else {
			grade = "F";
		}		
		return grade;
	}
	public String genderChecker(String number) { //메인에서 한개로 받았으니 여기서도 한개로 받아라
		String checker = "";
		char cov = number.charAt(7);
		switch(cov) {
		case '1' : case '3' : checker = "남자";
		case '2' : case '4' : checker = "여자";
		case '5' : case '6' : checker = "외국인";
		default : checker = "다시입력하세요";
		}
		return checker;
	}
	
		
		
}

