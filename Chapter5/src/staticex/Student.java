package staticex;

public class Student { 
	
	private static int serialNum = 1000; //��� �����Ǵ� �� 
	private int studentID;  // �����Ǵ� �� �ϳ��� �����´�. 
	public String studentName;
	public String address; 
	
	public Student(String name) { 
		studentName = name;
		serialNum++;
		studentID = serialNum;
		
	} 
	
	public Student (int id, String name) {
		studentID = id; 
		studentName = name; 
		address = "�ּ� ����";
		serialNum++;
		studentID = serialNum;
		
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address );
	}
	
	public String getStudentName() {
		return studentName;
		
	}
	
	public int getStudentID() {
		// serialNum++;  �Ϲݺ����� static���� ��� ���� 
		// ���α׷��� �ε� �� �� Data������ �����Ǳ� �����̴�.
		return studentID;
		
	}

	public static int getSerialNum() {
		int i = 0; //�������� 
		// studentName = "Lee"; �� ������ �ν��Ͻ��� new�Ǿ�� ����� �� �ִ� �����̱⿡ 
		// static �޼��� �ȿ��� ��� �Ұ� 
		 
		return serialNum; //static���� 
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	
	
}
