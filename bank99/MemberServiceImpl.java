package bank99;

public class MemberServiceImpl implements MemberService{//MemberServiceImpl는 기능이라 getter/setter/쓰면안된다
	private MemberBean[] members;//필드에서는 assignment사용못함 그리고 여기서 생성자를 생성하면 계속 값이 초기화된다
	private int count; //은닉화하기위해 무조건 멤버변수가면 private///i의 이름은 count로 바꿔줬다
	//필드에서는 상수를 제외한 어떤것도 사용못한다
	MemberServiceImpl(){
		this.members = new MemberBean[10];
		this.count = 0;
	}
	@Override
	public void join(String id, String name, String pass, String ssn) {//MemberBean에서 void로 바뀜
		MemberBean member = new MemberBean(); //void로 바뀌니까 밑에 return있으면 안된다
		member.setId(id);	//for로쓰면 join을 부를때마다 i가 0이되기때문에 분리
		member.setName(name);
		member.setPass(pass);
		member.setSsn(ssn);
		members[count] = member;//처음에는다 i였다 for문이 있었던자리 해체함
		count++;
		//System.out.println("카운트: "+count);
		}
	@Override
	public MemberBean[] list() {
		// TODO Auto-generated method stub
		return members;  
		//members로 받아줌
	}
	
	@Override
	public MemberBean find(String id) { // equals는 object꺼라 항상끌어다쓸수있음
		MemberBean member = new MemberBean();
		for(int i=0;i<count;i++) {
			if(members[i].getId().equals(id)) {
				member = members[i]; 
				break;
			}
		}
		// TODO Auto-generated method stub
		return member;
	}
	@Override
	public boolean login(String id, String pw) {
		boolean ok = false;
		for(int i=0;i<count;i++) {
			if(members[i].getId().equals(id) && members[i].getPass().equals(pw)) {
				ok = true;
				break;
			}
		}
		// TODO Auto-generated method stub
		return ok;
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return (count+1);
	}
	
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
	}
	
	
}
	

