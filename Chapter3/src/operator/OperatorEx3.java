package operator;

public class OperatorEx3 {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ( (num1 = num1 + 10) <10 ) && ( ( i = i+2 ) < 10); //앞에만 봐도 평가가 가능한 경우이기 때문에
		System.out.println(num1); // num 값은 변하지만 
		System.out.println(i); // i는 변하지 않는다. 하지만  || (or) 인 경우 (조건 : 앞의 값이 False인 경우에만)두 값이 다 변한다.
		
		System.out.println(value);
		
		int num2 = 10;
		int num3 = 20;
		
		int max = (num2>num3)? num2 : num3;
		System.out.println(max);
		
	}

}
