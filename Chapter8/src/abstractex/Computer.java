package abstractex;

public abstract class Computer { //추상 클래스 주로  상위클래스로  사용 
	
	//추상메서드, 하위 클래스에 따라서 달라지기 때문에 구현 x 하지만 메서드 자체는 선언해야함 ..위임 
	public abstract void display();
	public abstract void typing(); 
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
