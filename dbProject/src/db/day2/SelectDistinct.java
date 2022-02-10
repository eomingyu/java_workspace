package db.day2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import db.day1.OracleConnectUtil;

public class SelectDistinct {
//select 연습
	public static void main(String[] args) {
		Connection conn = OracleConnectUtil.connect();
		PreparedStatement pstmt;
		ResultSet rs;
		String sql = "SELECT DISTINCT pcode FROM TBL_BUY#";
		
		
		System.out.println("구매 내역 확인합니다.");
		System.out.println("구매 내역은 판매된 상품코드로 조회합니다.");
		System.out.println("판매된 상품 코드 확인하기");
		//판매된 상품 코드를 자바변수(List)에 저장해 보세요. codes  일부만 가져올 수 있다.
		List<String> codes = new ArrayList<>();
		
		
			try {
				pstmt = conn.prepareStatement(sql);
				rs=pstmt.executeQuery();
				
				while(rs.next()) {
					codes.add(rs.getString(1));
					System.out.print(String.format("%-20s", rs.getString(1)));
				}
				System.out.println();
				
				System.out.println("codes 출력 확인----------------");
				System.out.println(codes);
				
				pstmt.close();
								
			} catch (SQLException e) {
				System.out.println("SQL 실행 오류 : "+e.getMessage());
			}
			
			Scanner sc = new Scanner(System.in);
			System.out.println("구매내역에 상품코드가 존재하는지 확인---");
			System.out.print("상품코드 입력 -> ");
			String pcode = sc.nextLine();
			
			//SELECT 한 결과가 변화가 없는 경우에 List를 활용합니다.
			if(codes.contains(pcode))	//리스트에 저장 후 리스트를 확인
				System.out.println("상품코드가 구매내역에 존재합니다.");
			else
				System.out.println("구매내역에 없는 상품코드입니다.");
		
		
		
		
		
	}

}
