package variable;
//문자 자료형 Java는 유니코드 사용 
public class CharTest {

	public static void main(String[] args) {
		
		char ch = 'A';
		// 문자는 내부적으로 양수값만 표현 음수는 x
		System.out.println(ch);
		System.out.println((int)ch); //int로 typecasting
		
		int iCh = 66;
		System.out.println(iCh); //B
		System.out.println((char)iCh); // char로 typecasting
		
		char hangul = '\uAC00'; //가 
		System.out.println(hangul);
		
		// 인코딩 - 각 문자에 다른 특정한 숫자값(코드 값)을 부여
		// 디코딩 - 숫자 값을 원래문자로 변환 
		
	}

}
