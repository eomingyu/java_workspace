package db.teamD;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui implements ActionListener{
	
	String[] menu = {"아메리카노","아이스 아메리카노","카페 라떼","캬라멜 마끼야또" };		// 메뉴 배열
	int[] cost = {2500,3000,3500,4000};										// 가격 배열

	JFrame frame;
	JPanel panel_main,panel_order;
	JButton bt_store,bt_pack;
	
	public Gui() {
		init();	//윈도우(화면)를 구성하는 요소를 생성합니다.
	}
	private void init() {
		ProductDao pd = ProductDao.getProductDao();
		if(pd.selectAll().size()==0) {
		for(int i=0;i<menu.length;i++)
		pd.insert(new Product(menu[i],cost[i]));
		}
		frame = new JFrame();
		frame.setTitle("D coffee");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(700, 1000);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);

		panel_main = new JPanel(); // 홈화면 Panel 시작
		panel_main.setBounds(0, 0, 700, 1000);
		frame.add(panel_main);
		panel_main.setLayout(null);
		panel_main.setVisible(true); // 홈화면 Panel 끝

		panel_order = new JPanel(); // 주문화면 Panel 시작
		panel_order.setBounds(0, 0, 700, 1000);
		frame.add(panel_order);
		panel_order.setLayout(null);
		panel_order.setVisible(false);

		bt_store = new JButton();
		bt_store.setBounds(30, 350, 300, 300);
		bt_store.addActionListener(this);
		bt_store.setText("매장");
		bt_store.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		bt_store.setBackground(Color.lightGray);
		bt_store.setBorder(BorderFactory.createEtchedBorder());
		panel_main.add(bt_store);

		bt_pack = new JButton();
		bt_pack.setBounds(360, 350, 300, 300);
		bt_store.addActionListener(this);
		bt_pack.setText("포장");
		bt_pack.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		bt_pack.setBackground(Color.lightGray);
		bt_pack.setBorder(BorderFactory.createEtchedBorder());
		panel_main.add(bt_pack);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt_store) {
			panel_order.setVisible(true);
			panel_main.setVisible(false);
			CustomDao cd = CustomDao.getCustomDao();
//			if(cd.selectAll().size()==0)		//고객 번호 없을 시 생성,매장
//				cd.insert("매장");				//		있을 시 변경,매장
//			else cd.update("매장");
		}else if(e.getSource()==bt_pack) {
			panel_order.setVisible(true);
    		panel_main.setVisible(false);
    		CustomDao cd = CustomDao.getCustomDao();
//    		if(cd.selectAll().size()==0)
//				cd.insert("포장");
//			else cd.update("포장");
		}
	}
	public static void main(String[] args) {
		new Gui();
	}

}
