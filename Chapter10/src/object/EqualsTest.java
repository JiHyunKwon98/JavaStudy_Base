package object;
class Student{
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) { //재정의 객체 값이 같은 경우 true반환하기 위해
		if(obj instanceof Student) {
			Student std = (Student)obj; 
			//return (this.studentNum == std.studentNum);
			if(this.studentNum == std.studentNum)
				return true;
			else return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}
	
	
}
public class EqualsTest {

	public static void main(String[] args) {
		
	/*	Student Lee = new Student(100,"이순신");
		Student Lee2 = Lee; //물리적 주소가 같음 
		Student Shin = new Student(100,"이순신");
		
		System.out.println(Lee == Shin); //instance주소가 다르기에 False
		System.out.println(Lee.equals(Shin)); 
		
		System.out.println(Lee.hashCode()); 
		System.out.println(Shin.hashCode());
		
		*/
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		/*
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		*/

	}

}
