package db.day1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest2 {
// ResultSet 타입 쿼리 결과를 모두 출력하기 : rs.next()반복조건으로 이용해서
	
	public static void main(String[] args) {
		Connection conn = OracleConnectUtil.connect();
		String sql = "select * from tbl_custom#";
		PreparedStatement pstmt = null;
		
		//select 쿼리는 반환결과데이터를 저장해야합니다.
		ResultSet rs = null;	//쿼리 반환 결과 테이블의 데이터를 참조합니다. 반환 결과는 행 단위로 접근합니다.
		//insert, update, delete는 쿼리 실행한 반환 결과 데이터가 없습니다.
		try {
			pstmt = conn.prepareStatement(sql);
			
			//pstmt.execute();			//insert,update,delete
			rs=pstmt.executeQuery();		//select
			
			System.out.println("조회 결과 있습니까?"+rs.next());
			System.out.println("행 데이터 보기----------------------------------------------");
			System.out.println("custom_id name\temail\t\tage\treg_date");
			System.out.println("-------------------------------------------------------");
			while(rs.next()) {
			System.out.print(rs.getString("custom_id")+"\t");
			System.out.print(rs.getString("name")+"\t");
			System.out.print(rs.getString("email")+"\t");
			System.out.print(rs.getInt("age")+"\t");
			System.out.print(rs.getTimestamp("reg_date")+"\n");
			}
			
			
			pstmt.close();
			
		}catch(SQLException e) {
			System.out.println("SQL 실행 오류 : "+ e.getMessage());
		}
		
		
		OracleConnectUtil.close(conn);
	}

}
