package variable;

public class ImplicitConversion {

	public static void main(String[] args) {

		byte bNum = 10;
		int iNum = bNum; // ������ ����ȯ 
						 // ���� ������ ū ���� �� ������ ������ �� ������ ���� ���ԵǴ� ��� 
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum; //iNum�� �Ǽ��� �ٲ��. 2���� ����ȯ int->float->double
		
		System.out.println(dNum);
		
	}

}
