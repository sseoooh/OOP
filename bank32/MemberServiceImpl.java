package bank32;

public class MemberServiceImpl implements MemberService{

	@Override
	public MemberBean join(String id, String name, String ssn, String pass) {
		MemberBean member = new MemberBean();
		member.setId(id);
		member.setName(name);
		member.setPass(pass);
		member.setSsn(ssn);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
