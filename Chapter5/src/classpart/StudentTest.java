package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		studentLee.studentName = "이순신"; //studentKim과 다른 각각의 메모리를 갖는다.  
		studentLee.address = "서울";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.address = "경주";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee); //class 풀네임(Student)  + 주소값(studentLee)16진수 출력 
		System.out.println(studentKim); //class 풀네임  + 주소값(studentKim) 출력 

	}

}
