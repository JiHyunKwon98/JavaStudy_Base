package staticex;

public class StudentIDTest {

	public static void main(String[] args) {
		
		//Student studentLee = new Student("Lee");
		//System.out.println(studentLee.serialNum);
		
		System.out.println(Student.getSerialNum()); //static �޼��� class �̸����� ����
		//instance�� ������ ��� ���� ȣ��Ǵ� �޼��� 
		
		/*Student studentKim = new Student("Kim");
		
		System.out.println(studentKim.serialNum); // ���� ����� ����. = ���� �޸𸮸� �ٶ󺸰� �ִ�.
		System.out.println(studentLee.serialNum);
		
		System.out.println(studentLee.getStudentID());
		System.out.println(studentKim.getStudentID());
		 */
	}

}
