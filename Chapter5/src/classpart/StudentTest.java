package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		studentLee.studentName = "�̼���"; //studentKim�� �ٸ� ������ �޸𸮸� ���´�.  
		studentLee.address = "����";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.address = "����";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee); //class Ǯ����(Student)  + �ּҰ�(studentLee)16���� ��� 
		System.out.println(studentKim); //class Ǯ����  + �ּҰ�(studentKim) ��� 

	}

}
