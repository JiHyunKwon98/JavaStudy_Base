package classpart;
// class ���� �� ����  //public class�� �ϳ�!
public class Student { //public Ű���带 ���� class name = java file name

	public int studentID; //public ���������� 
	public String studentName; //String �ڹٿ��� �����ϴ� ���ڿ� 
	public String address; // ������� 
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address );
	}
	
	public String getStudentName() {
		return studentName;
	}
}
