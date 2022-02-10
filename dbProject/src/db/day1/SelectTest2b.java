package db.day1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest2b {
// ResultSet 타입 쿼리 결과를 모두 출력하기 : rs.next()반복조건으로 이용해서

	public static void main(String[] args) {
		Connection conn = OracleConnectUtil.connect();
		String sql = "select * from tbl_custom#";
		PreparedStatement pstmt = null;

		// select 쿼리는 반환결과데이터를 저장해야합니다.
		ResultSet rs = null; // 쿼리 반환 결과 테이블의 데이터를 참조합니다. 반환 결과는 행 단위로 접근합니다.
		// insert, update, delete는 쿼리 실행한 반환 결과 데이터가 없습니다.
		try {
			pstmt = conn.prepareStatement(sql);

			// pstmt.execute(); //insert,update,delete
			rs = pstmt.executeQuery(); // select //리턴타입이 있으면 대입문이 필요하다.

			// rs.next()에서 next() 메소드는 행의 위피를 다음으로 이동시키고
			// 이동한 위치에 데이터가 존재하면 참, 없으면 거짓입니다.

			//Strimg.format
			int i = 1;
			while (rs.next()) {
				System.out.print(i++ + "행   ");
				System.out.print(String.format("%-20s", rs.getString("custom_id")));
				System.out.print(String.format("%-20s", rs.getString("name")));
				System.out.print(String.format("%-20s", rs.getString("email")));
				System.out.print(String.format("%5d  ", rs.getInt("age")));	//정수는 오른쪽 정렬이 맞다. 자릿수 커질 때
				System.out.println(rs.getTimestamp("reg_date"));
			}

			pstmt.close();

		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}

		OracleConnectUtil.close(conn);
	}

}
