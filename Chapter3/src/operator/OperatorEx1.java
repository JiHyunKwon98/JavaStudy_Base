package operator;

public class OperatorEx1 {

	public static void main(String[] args) {
	
		int num1 = -10;
		int num2 = 20;
		
		System.out.println(+num1);
		System.out.println(+num2);
		
		System.out.println(-num1); // 부호연산자는 참조해서 결과값을 바꾼다.
		System.out.println(-num2); 
		
		num1 = -num1;
		System.out.println(num1);

	}

}
