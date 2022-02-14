package db.day4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.day1.OracleConnectUtil;
import db.vo.SaleByCustom;

public class SaleByDao {
//v_by_custno view에서 select 쿼리 실행하는 메소드 정의
	
	//싱글턴 객체 생성 코딩
	private static SaleByDao saleDao = new SaleByDao();
	private SaleByDao(){}
	public static SaleByDao getSaleByDao() {
		return saleDao;
	}
	
	//SELECT * FROM V_BY_CUSTNO 실행하는 코드
	public List<SaleByCustom> selectByCustnoAll() {
		List<SaleByCustom> list = new ArrayList<>();
		Connection conn = OracleConnectUtil.connect();
		PreparedStatement pstmt = null;
		String sql="SELECT * FROM V_BY_CUSTNO";
		ResultSet rs = null;
				
		try {
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				list.add(new SaleByCustom(rs.getInt(1),
										rs.getString(2),
										rs.getString(3),
										rs.getInt(4)));
			}
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류: "+e.getMessage());
		}
		OracleConnectUtil.close(conn);
		return list;
	}
	
	
}
