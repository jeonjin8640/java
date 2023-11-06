package exam;

import java.sql.SQLException;
import java.util.List;

import exam.Member;

public class MemberEx {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		MemberDao dao = new MemberDao();

		boolean run = false;
		while(!run) {
		int choice = dao.menu();
		switch(choice){
		case 1:
			
			List<Member> list = dao.getMembers();
		if( list.isEmpty() ) {
		System.out.println("가입된 회원이 없습니다.");
		}else{
		System.out.println("가입된 회원은" + list.size()+"명 입니다.");
		for(Member mem : list) {
		System.out.println( mem.toString() );
		}
		}
		System.out.println("");
		break;
		case 2:
		int result = dao.setMember();
		if( result > 0 ){
		System.out.println("회원가입 완료");
		}else{
		System.out.println("회원가입 되지 않았습니다.");
		break;}
		
		default:
		dao.disconnect();
		break;
	}

}
	}}	
