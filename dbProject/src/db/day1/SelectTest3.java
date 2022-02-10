package db.day1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectTest3 {
//select 쿼리를 조건식으로 조회하는 연습입니다. 조건컬럼 custom_id이며 기본키 컬럼입니다.
//		- 조회 결과는  0 또는 1개입니다.
//조건식 사용 컬럼이 기본키가 아닐 때는 while로 반복하며 카운트 변수 사용합니다.	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);			//*
		Connection conn = OracleConnectUtil.connect();
		String sql = "select * from tbl_custom# where custom_id=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null; 
		
		System.out.print("조회할 고객 id를 입력하세요 -> "); //*
		String custom_id = sc.nextLine();			//*
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, custom_id);			//*	//쿼리 실행에 필요한 매개변수(?) 전달합니다.
			rs = pstmt.executeQuery(); 		//select


			if(rs.next()) {							//*
				System.out.print(String.format("%-20s", rs.getString("custom_id")));
				System.out.print(String.format("%-20s", rs.getString("name")));
				System.out.print(String.format("%-20s", rs.getString("email")));
				System.out.print(String.format("%5d  ", rs.getInt("age")));	//정수는 오른쪽 정렬이 맞다. 자릿수 커질 때
				System.out.println(rs.getTimestamp("reg_date"));
			}else {									//*
				System.out.println("조회한 ID는 없는 고객입니다.");
			}
			pstmt.close();

		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}

		OracleConnectUtil.close(conn);
	}

}
