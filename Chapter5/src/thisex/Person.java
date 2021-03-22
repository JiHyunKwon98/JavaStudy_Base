package thisex;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		this("이름 없음",1); //위에 다른 스테이트먼트는 올 수 없다.
	}
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	public void showInfo() {
		System.out.println(name+","+age);	
	}
	
	public Person getSelf() {
		return this;
	}
}
