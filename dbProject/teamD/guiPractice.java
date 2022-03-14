package db.teamD;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

	public class guiPractice {
		private JFrame frame;
		   String[] menu = {"아메리카노","아이스 아메리카노","카페 라떼","캬라멜 마끼야또" };
		   int[] cost = {2500,3000,3500,4000};
		   int side_total =0;
		   int total_price = 0;
		   int c_count =0;
		   int h_count =0;
		   int count1 = 0;
		   int count2 = 0;
		   
		   String btnString1 = "";
		   String btnString2 = "";
		   String btnString3 = "";
		   String btnString4 = "";
		   String btnString5 = "";
		   String btnString6 = "";
		   
		   
		   String c_choose= "";
		   String h_choose= "";
		   
		   JLabel lbltotalP = new JLabel("0\uC6D0");
		   
		   JLabel lbltotal_c_cart = new JLabel("0\uC6D0");
		   
		public guiPractice() {
		      initialize();
		}
		
		private void initialize() {
			
			CustomDao cd = CustomDao.getCustomDao();
			ProductDao pd = ProductDao.getProductDao();
			OrderListDao odl = OrderListDao.getOrderListDao();
			
			
			
			
			frame = new JFrame();			//기본 Frame시작
			frame.setSize(700,1000);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.getContentPane().setLayout(null);
		    frame.setResizable(false);
		    frame.setLocationRelativeTo(null);
		    frame.setTitle("D Coffee");		//기본 Frame끝
		    
		    JPanel panel_main = new JPanel();		// 홈화면 Panel 시작
		    panel_main.setBounds(0,0,700,1000);
		    frame.add(panel_main);
		    panel_main.setLayout(null);
		    panel_main.setVisible(true);			// 홈화면 Panel 끝
		    
		    JPanel panel_order = new JPanel();		// 주문화면 Panel 시작
		    panel_order.setBounds(0,0,700,1000);
		    frame.add(panel_order);
		    panel_order.setLayout(null);
		    panel_order.setVisible(false);			// 주문화면 Panel 끝

		    JButton btn_eat = new JButton("매 장");				  // 홈화면 매장버튼 설정 시작
		    btn_eat.setBounds(20,50,650,320);
		    btn_eat.setFont(new Font("바탕", Font.ITALIC, 150));   // 홈화면 매장버튼 설정 끝	
		    panel_main.add(btn_eat);									
		    JButton btn_wrap = new JButton("포 장"); 			      // 홈화면 포장버튼 설정 시작
		    btn_wrap.setBounds(20,490,650,320);
		    btn_wrap.setFont(new Font("바탕", Font.ITALIC, 150));	  // 홈화면 포장버튼 설정 끝
		    panel_main.add(btn_wrap);					
		    
		    btn_eat.addActionListener(new ActionListener() {	// 매장버튼 클릭시 이벤트 시작
				public void actionPerformed(ActionEvent e) {
					panel_order.setVisible(true);
					panel_main.setVisible(false);
//					if(cd.selectAllC()==null)		//고객 번호 없을 시 생성,매장
//						cd.insertC("매장");				//		있을 시 변경,매장
//					else cd.updateC("매장");
					
				}	
		    });													// 매장버튼 클릭시 이벤트 끝
		    
		    btn_wrap.addActionListener(new ActionListener() {	// 포장버튼 클릭시 이벤트 시작
		    	public void actionPerformed(ActionEvent e) {
		    		panel_order.setVisible(true);
		    		panel_main.setVisible(false);
//		    		if(cd.selectAllC()==null)
//						cd.insertC("포장");
//					else cd.updateC("포장");
		    	}
		    });													// 포장버튼 클릭시 이벤트 끝
		    
		    JButton btn_home = new JButton(new ImageIcon("./image/7.jpg"));		// 메뉴화면 홈버튼 설정 시작
		    btn_home.setBounds(550,30,100,100);
		    panel_order.add(btn_home);											// 메뉴화면 홈버튼 설정 끝
		    
		    btn_home.addActionListener(new ActionListener() {					// 홈버튼 클릭시 홈화면 이동 시작
				public void actionPerformed(ActionEvent e) {
					panel_main.setVisible(true);
					panel_order.setVisible(false);
				}			
		    });																	// 홈버튼 클릭시 홈화면 이동 끝
		    
		    JLabel hlb = new JLabel("D Coffee");								// 머릿글 설정 시작
		    hlb.setHorizontalAlignment(SwingConstants.CENTER);
		    hlb.setBounds(142, 30, 300, 120);
		    hlb.setFont(hlb.getFont().deriveFont(72.0f));						// 머릿글 설정 끝
		    panel_order.add(hlb);		
		    
		    JButton btn_ice = new JButton(new ImageIcon("./image./coffee/11.jpg"));
		    btn_ice.setBounds(70,170,240,200);
		    panel_order.add(btn_ice);
		    
		    JButton btn_hot = new JButton(new ImageIcon("./image./coffee/22.jpg"));
		    btn_hot.setBounds(380,170,240,200);
		    panel_order.add(btn_hot);
		    
		    JButton btn_latte = new JButton(new ImageIcon("./image./coffee/33.jpg"));
		    btn_latte.setBounds(70,435,240,200);
		    panel_order.add(btn_latte);
		    
		    JButton btn_caramel = new JButton(new ImageIcon("./image./coffee/44.jpg"));
		    btn_caramel.setBounds(380,435,240,200);
		    panel_order.add(btn_caramel);
		    
		    JLabel hot = new JLabel();											// 아메리카노 글자 설정 시작
		    hot.setText(String.valueOf(menu[0] + "  " + cost[0] + "원") );
		    hot.setHorizontalAlignment(SwingConstants.CENTER);
		    hot.setBounds(90,290,200,200);
		    hot.setFont(hlb.getFont().deriveFont(20.0f));					 	// 아메리카노 글자 설정 끝			
		    panel_order.add(hot);
		    
		    JLabel ila = new JLabel();											// 아이스 아메리카노 글자 설정 시작
		    ila.setText(String.valueOf(menu[1] + "  " + cost[1] + "원") );
		    ila.setHorizontalAlignment(SwingConstants.CENTER);
		    ila.setBounds(325,290,350,200);
		    ila.setFont(hlb.getFont().deriveFont(20.0f));					 	// 아이스 아메리카노 글자 설정 끝			
		    panel_order.add(ila);
		    
		    JLabel latte = new JLabel();											// 카페라떼 글자 설정 시작
		    latte.setText(String.valueOf(menu[2] + "  " + cost[3] + "원") );
		    latte.setHorizontalAlignment(SwingConstants.CENTER);
		    latte.setBounds(90,555,200,200);
		    latte.setFont(hlb.getFont().deriveFont(20.0f));					 	// 카페라떼 글자 설정 끝			
		    panel_order.add(latte);
		    
		    JLabel caramel = new JLabel();											// 캬라멜 마끼아또 글자 설정 시작
		    caramel.setText(String.valueOf(menu[3] + "  " + cost[3] + "원") );
		    caramel.setHorizontalAlignment(SwingConstants.CENTER);
		    caramel.setBounds(355,555,280,200);
		    caramel.setFont(hlb.getFont().deriveFont(20.0f));					 	// 캬라멜 마끼야또 글자 설정 끝			
		    panel_order.add(caramel);
		    
		    JLabel orders = new JLabel();
		    orders.setText(String.format("%-20s", "메뉴")+"\t"
		    		+String.format("%5s", "단가")+"\t"
		    		+String.format("%7s", "수량")+"\t"+String.format("%15s", "금액"));
		    orders.setBounds(70, 550, 500, 300);
		    orders.setFont(hlb.getFont().deriveFont(20.0f));
		    panel_order.add(orders);

		    btn_ice.addActionListener(new ActionListener() {	// 아메리카노 버튼 클릭시 이벤트 시작
				public void actionPerformed(ActionEvent e) {
				
					
				}	
		    });	
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
		         public void run() {
		            try {
		            	guiPractice kiosk = new guiPractice();
		               kiosk.frame.setVisible(true);
		           } catch (Exception e) {
		               e.printStackTrace();
		           }
		       }
		  });
	}
}