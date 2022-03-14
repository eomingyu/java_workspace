package proc_0311;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import db.day1.OracleConnectUtil;

//데이터베이스에서 만든 proc_set_money 프로시저를 jdbc 방식으로
//실행합니다.
public class SetMoneyProc {

	public static void main(String[] args) {
		Connection conn = OracleConnectUtil.connect();
		String sql ="{ call proc_set_money(?,?,?,?)}";				
		//데이터베이스 프로시저 호출 {call 프로시저이름(매개변수)}
		//프로시저에서 실행할 때 필요한 매개변수 선언
		String custom_id="wonder";
		String pcode="CJ-BABQ1";
		int quantity=5;
		//프로시저 실행은 PreparedStatement 아니고
		CallableStatement cstmt=null;
		try {
			cstmt = conn.prepareCall(sql);
			//매개변수값 설정
			cstmt.setString(1, custom_id);
			cstmt.setString(2, pcode);
			cstmt.setInt(3, quantity);
			//4번째 매개변수는 OUT 임을 알려주기
			cstmt.registerOutParameter(4,Types.VARCHAR);
			//정수/실수일 때는 Types.Numeric, 날짜 Types.Date
			cstmt.executeUpdate();	
			//프로시저 실행 excute는 boolean 리턴 excuteUpdate는 int 리턴 두 개 다 가능
			//실행 후 프로시저 출력 매개변수 가져와서 print
			System.out.println("실행 결과 : "+cstmt.getString(4));
			cstmt.close();
		} catch (SQLException e) {
			System.out.println("실행 오류 : "+e.getMessage());
		}finally {
			OracleConnectUtil.close(conn);
		}
	}
}
