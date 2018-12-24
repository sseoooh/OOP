package bank99;
//
public interface MemberService {
	// 회원가입
	public void join(String id,String name,String pass,String ssn);//public MemberBean가 void로바뀜
	//------------------------------------------------------------
	// 목록보기
	public MemberBean[] list();	//list find 
	// 개인정보 검색
	public MemberBean find(String id);
	// 로그인
	public boolean login(String id, String pw); //login은 Read(로그인 성공실패밖에없으니까 불린) 
	// 회원수
	public int count();
	//-------------------------------------------------------------
	// 정보수정
	public void update();
	// 회원탈퇴
	public void delete();  //set 생성,수정,삭제 //get 목록,검색,갯수
}