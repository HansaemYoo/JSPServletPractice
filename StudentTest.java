package ch03;

// Ŭ������ �ν��Ͻ�
public class StudentTest {

	// �ʵ�
	String name;
	int grade;
	String address;
	
	// �޼ҵ�
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
		
		// ��ü ����
		StudentTest stdLee = new StudentTest();
		StudentTest stdKim = new StudentTest();
		
		// �ʱ�ȭ
		stdLee.name = "���ڹ�";
		stdLee.grade = 4;
		stdLee.address = "����Ư����";
		
		stdKim.name = "���ڹ�";
		stdKim.grade = 3;
		stdKim.address = "��⵵ ������";
		
		// ���
		stdLee.showStudentInfo();
		stdKim.showStudentInfo();
		
	}
	
}
