package classpart;
// class 여러 개 가능  //public class는 하나!
public class Student { //public 키워드를 가진 class name = java file name

	public int studentID; //public 접근제어자 
	public String studentName; //String 자바에서 제공하는 문자열 
	public String address; // 멤버변수 
	
	public Student() { //default 생성자 
		
	} //구현 안했을 시 complier가 기본생성자 만들어준다. 
	
	public Student (int id, String name) {
		studentID = id; //두 개의 매개변수를 받았다. 
		studentName = name; 
		//address는 null로 초기화 또는 address = "주소 없음";
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address );
	}
	
	public String getStudentName() {
		return studentName;
		
	}
	
	
	
}
