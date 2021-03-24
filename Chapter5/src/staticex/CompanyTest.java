package staticex;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company company1 = Company.getInstance(); //가져오는 것은 단 하나 
		
		Company company2 = Company.getInstance();
		
		System.out.println(company1); //결과 같다 .
		System.out.println(company2);
		
		Calendar calendar = Calendar.getInstance(); 
	}

}
