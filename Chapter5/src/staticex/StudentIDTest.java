package staticex;

public class StudentIDTest {

	public static void main(String[] args) {
		
		//Student studentLee = new Student("Lee");
		//System.out.println(studentLee.serialNum);
		
		System.out.println(Student.getSerialNum()); //static 메서드 class 이름으로 접근
		//instance의 생성과 상돤 없이 호출되는 메서드 
		
		/*Student studentKim = new Student("Kim");
		
		System.out.println(studentKim.serialNum); // 둘의 결과가 같다. = 같은 메모리를 바라보고 있다.
		System.out.println(studentLee.serialNum);
		
		System.out.println(studentLee.getStudentID());
		System.out.println(studentKim.getStudentID());
		 */
	}

}
