package operator;

public class OperatorEx3 {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ( (num1 = num1 + 10) <10 ) && ( ( i = i+2 ) < 10); //�տ��� ���� �򰡰� ������ ����̱� ������
		// ���� �������� �Ǵ����� ����. ����
		System.out.println(num1); // num ���� ��������  20
		System.out.println(i); // i�� ������ �ʴ´�. 2 ������  || (or) �� ��� (���� : ���� ���� False�� ��쿡��)�� ���� �� ���Ѵ�.
		
		System.out.println(value); //10 + 10 < 10 false 
		
		int num2 = 10;
		int num3 = 20;
		
		int max = (num2>num3)? num2 : num3; //���׿����� 
		System.out.println(max); //  10>20 -> false ���� num3 ��� 20
		
	}

}
