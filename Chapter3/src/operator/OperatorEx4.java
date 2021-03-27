package operator;

public class OperatorEx4 {
	
	public static void main(String[] args) {
		
	int num1 = 0B00001010; //10
	int num2 = 0B00000101; //5
	
	System.out.println(num1 & num2); // 0
	System.out.println(num1 | num2); // 15
	System.out.println(num1 ^ num2); //15
	
	System.out.println(num2 << 3 ); //40 실제 값을 바꾸려면 대입연산자를 사용해야한다.
	System.out.println(num2 >> 2 ); //1
	
	}

}
