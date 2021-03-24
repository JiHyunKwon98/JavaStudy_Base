package staticex;

public class Student { 
	
	private static int serialNum = 1000; //계속 증가되는 값 
	private int studentID;  // 증가되는 값 하나만 가져온다. 
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
		address = "주소 없음";
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
		// serialNum++;  일반변수에 static변수 사용 가능 
		// 프로그램이 로드 될 때 Data영역에 생성되기 때문이다.
		return studentID;
		
	}

	public static int getSerialNum() {
		int i = 0; //지역변수 
		// studentName = "Lee"; 이 변수는 인스턴스가 new되어야 사용할 수 있는 변수이기에 
		// static 메서드 안에서 사용 불가 
		 
		return serialNum; //static변수 
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	
	
}
