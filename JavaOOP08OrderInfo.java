package javaOOP08;

//8-2. 복습하기2
public class JavaOOP08OrderInfo {

	//필드
	public String orderNumber;
	public String phoneNumber;
	public String address;
	public int orderDate;
	public int price;
	
	//생성자
	public JavaOOP08OrderInfo(String orderNumber, String phoneNumber, String address, int orderDate, int price) {
		this.orderNumber = orderNumber;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.orderDate = orderDate;
		this.price = price;
	}
	
	//메소드
	public void ON() {
		System.out.println("주문 접수 번호 : " + this.orderNumber);
	}
	
	public void PN() {
		System.out.println("주문 핸드폰 번호 : " + this.phoneNumber);
	}
	
	public void OA() {
		System.out.println("주문 접수 주소 : " + this.address);
	}
	
	public void OD() {
		System.out.println("주문 접수 날짜 : " + this.orderDate);
	}
	
	public void OP() {
		System.out.println("주문 가격 : " + this.price);
	}
}
