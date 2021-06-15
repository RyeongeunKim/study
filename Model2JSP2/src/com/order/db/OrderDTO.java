package com.order.db;

import java.sql.Date;

public class OrderDTO {
	
	private int o_num;  			//테이블 주문번호  (1,2,3,4,...)
	private String o_trade_num;		//상품 주문번호 (123123-123123)
	
	private int o_g_num;			//주문된 상품물건 번호
	private String o_g_name;		//주문된 상품 이름
	private int o_g_amount;		//주문된 상품 수량
	private String o_g_color;		//주문된 상품 색상
	private String o_g_size;		//주문된 상품 크기
	private String o_m_id;			//주문한 사람의 ID
	
	private String o_receive_name;	//받는사람 이름
	private String o_receive_addr1;	//받는 사람 주소1
	private String o_receive_addr2;	//받는 사람 주소2
	private String o_receive_phone; //받는 사람 연락처
	private String o_receive_msg;	//배송 메세지
	
	private int o_sum_money; 		// 주문 총액
	private String o_trade_type;	//결제 방법
	private String o_trade_payer;	//결제자
	private Date o_trade_date;		//결제 시간
	
	private String o_trans_num;		//택배 운송장정보
	private Date o_date;			//주문테이블 시간정보
	private int o_status;			//주문상태 저장정보
	
	
	public int getO_num() {
		return o_num;
	}
	public void setO_num(int o_num) {
		this.o_num = o_num;
	}
	public String getO_trade_num() {
		return o_trade_num;
	}
	public void setO_trade_num(String o_trade_num) {
		this.o_trade_num = o_trade_num;
	}
	public int getO_g_num() {
		return o_g_num;
	}
	public void setO_g_num(int o_g_num) {
		this.o_g_num = o_g_num;
	}
	public String getO_g_name() {
		return o_g_name;
	}
	public void setO_g_name(String o_g_name) {
		this.o_g_name = o_g_name;
	}
	public int getO_g_amount() {
		return o_g_amount;
	}
	public void setO_g_amount(int o_g_amount) {
		this.o_g_amount = o_g_amount;
	}
	public String getO_g_color() {
		return o_g_color;
	}
	public void setO_g_color(String o_g_color) {
		this.o_g_color = o_g_color;
	}
	public String getO_g_size() {
		return o_g_size;
	}
	public void setO_g_size(String o_g_size) {
		this.o_g_size = o_g_size;
	}
	public String getO_m_id() {
		return o_m_id;
	}
	public void setO_m_id(String o_m_id) {
		this.o_m_id = o_m_id;
	}
	public String getO_receive_name() {
		return o_receive_name;
	}
	public void setO_receive_name(String o_receive_name) {
		this.o_receive_name = o_receive_name;
	}
	public String getO_receive_addr1() {
		return o_receive_addr1;
	}
	public void setO_receive_addr1(String o_receive_addr1) {
		this.o_receive_addr1 = o_receive_addr1;
	}
	public String getO_receive_addr2() {
		return o_receive_addr2;
	}
	public void setO_receive_addr2(String o_receive_addr2) {
		this.o_receive_addr2 = o_receive_addr2;
	}
	public String getO_receive_phone() {
		return o_receive_phone;
	}
	public void setO_receive_phone(String o_receive_phone) {
		this.o_receive_phone = o_receive_phone;
	}
	public String getO_receive_msg() {
		return o_receive_msg;
	}
	public void setO_receive_msg(String o_receive_msg) {
		this.o_receive_msg = o_receive_msg;
	}
	public int getO_sum_money() {
		return o_sum_money;
	}
	public void setO_sum_money(int o_sum_money) {
		this.o_sum_money = o_sum_money;
	}
	public String getO_trade_type() {
		return o_trade_type;
	}
	public void setO_trade_type(String o_trade_type) {
		this.o_trade_type = o_trade_type;
	}
	public String getO_trade_payer() {
		return o_trade_payer;
	}
	public void setO_trade_payer(String o_trade_payer) {
		this.o_trade_payer = o_trade_payer;
	}
	public Date getO_trade_date() {
		return o_trade_date;
	}
	public void setO_trade_date(Date o_trade_date) {
		this.o_trade_date = o_trade_date;
	}
	public String getO_trans_num() {
		return o_trans_num;
	}
	public void setO_trans_num(String o_trans_num) {
		this.o_trans_num = o_trans_num;
	}
	public Date getO_date() {
		return o_date;
	}
	public void setO_date(Date o_date) {
		this.o_date = o_date;
	}
	public int getO_status() {
		return o_status;
	}
	public void setO_status(int o_status) {
		this.o_status = o_status;
	}
	
	// alt+shift+s+s
	@Override
	public String toString() {
		return "OrderDTO [o_num=" + o_num + ", o_trade_num=" + o_trade_num + ", o_g_num=" + o_g_num + ", o_g_name="
				+ o_g_name + ", o_g_amount=" + o_g_amount + ", o_g_color=" + o_g_color + ", o_g_size=" + o_g_size
				+ ", o_m_id=" + o_m_id + ", o_receive_name=" + o_receive_name + ", o_receive_addr1=" + o_receive_addr1
				+ ", o_receive_addr2=" + o_receive_addr2 + ", o_receive_phone=" + o_receive_phone + ", o_receive_msg="
				+ o_receive_msg + ", o_sum_money=" + o_sum_money + ", o_trade_type=" + o_trade_type + ", o_trade_payer="
				+ o_trade_payer + ", o_trade_date=" + o_trade_date + ", o_trans_num=" + o_trans_num + ", o_date="
				+ o_date + ", o_status=" + o_status + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
