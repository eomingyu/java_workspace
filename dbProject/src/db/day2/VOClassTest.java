package db.day2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.day1.OracleConnectUtil;
import db.vo.Custom;

public class VOClassTest {
//SelectTest2. VO 이용하여 자바 변수에 저장하는 연습입니다.
	public static void main(String[] args) {
		Connection conn = OracleConnectUtil.connect();
		String sql = "select * from tbl_custom#";
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		List<Custom> customs = new ArrayList<>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				
				customs.add(new Custom(rs.getString(1), 
										rs.getString(2), 
										rs.getString(3), 
										rs.getInt(4), 
										rs.getDate(5)));
			//getXXX(인덱스) : 인덱스는 select 뒤에 나열된 컬럼의 순서입니다.
			}
			System.out.println("List에 저장된 값 확인--------------");
			System.out.println(customs);
			System.out.println("List의 데이터를 1개씩 출력----------");
			for(int i=0;i<customs.size();i++) {
				System.out.print(String.format("i: %-3s", i+1));
				System.out.println(customs.get(i));
			}
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류: "+e.getMessage());
		}
		
	}

}
