package variable;

public class ImplicitConversion {

	public static void main(String[] args) {

		byte bNum = 10;
		int iNum = bNum; // 묵시적 형변환
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum; //iNum이 실수로 바뀐다. 2번의 형변환 int->float->double
		
		System.out.println(dNum);
		
	}

}
