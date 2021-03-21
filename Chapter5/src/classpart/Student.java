package classpart;
// class 여러 개 가능  //public class는 하나!
public class Student { //public 키워드를 가진 class name = java file name

	public int studentID; //public 접근제어자 
	public String studentName; //String 자바에서 제공하는 문자열 
	public String address; // 멤버변수 
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address );
	}
	
	public String getStudentName() {
		return studentName;
	}
}
