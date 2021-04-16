package ch03;

// 클래스와 인스턴스
public class StudentTest {

	// 필드
	String name;
	int grade;
	String address;
	
	// 메소드
	public void showStudentInfo() {
		System.out.println(name + "," + address);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		
		// 객체 생성
		StudentTest stdLee = new StudentTest();
		StudentTest stdKim = new StudentTest();
		
		// 초기화
		stdLee.name = "이자바";
		stdLee.grade = 4;
		stdLee.address = "서울특별시";
		
		stdKim.name = "김자바";
		stdKim.grade = 3;
		stdKim.address = "경기도 수원시";
		
		// 출력
		stdLee.showStudentInfo();
		stdKim.showStudentInfo();
		
	}
	
}
