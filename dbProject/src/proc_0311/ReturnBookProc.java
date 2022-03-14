package proc_0311;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import db.day1.OracleConnectUtil;

public class ReturnBookProc {

	public static void main(String[] args) {

		Connection conn = OracleConnectUtil.connect();
		Scanner sc = new Scanner(System.in);
		String sql = "{ call return_book(?,?,?,?)}";
		
		int mem_idx;
		String bcode;
		Date return_date;
		
		System.out.print("회원번호를 입력하세요 . -> ");
		mem_idx = Integer.parseInt(sc.nextLine());
		System.out.print("책의 코드번호를 입력하세요. -> ");
		bcode=sc.nextLine();
		System.out.print("반납일자를 입력하세요.(yyyy-mm-dd) -> ");
		return_date= Date.valueOf(sc.nextLine());
		
		CallableStatement cstmt=null;
		
		try {
			cstmt=conn.prepareCall(sql);
			cstmt.setInt(1, mem_idx);
			cstmt.setString(2, bcode);
			cstmt.setDate(3, return_date);
			cstmt.registerOutParameter(4, Types.VARCHAR);
			cstmt.executeUpdate();
			System.out.println("실행 결과: "+cstmt.getString(4));
			cstmt.close();
		} catch (SQLException e) {
			System.out.println("실행 오류 : "+e.getMessage());
		}finally {
			OracleConnectUtil.close(conn);
		}
		sc.close();	
	}
}
