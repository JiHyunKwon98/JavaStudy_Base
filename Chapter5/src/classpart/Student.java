package classpart;
// class ���� �� ����  //public class�� �ϳ�!
public class Student { //public Ű���带 ���� class name = java file name

	public int studentID; //public ���������� 
	public String studentName; //String �ڹٿ��� �����ϴ� ���ڿ� 
	public String address; // ������� 
	
	public Student() { //default ������ 
		
	} //���� ������ �� complier�� �⺻������ ������ش�. 
	
	public Student (int id, String name) {
		studentID = id; //�� ���� �Ű������� �޾Ҵ�. 
		studentName = name; 
		//address�� null�� �ʱ�ȭ �Ǵ� address = "�ּ� ����";
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address );
	}
	
	public String getStudentName() {
		return studentName;
		
	}
	
	
	
}
