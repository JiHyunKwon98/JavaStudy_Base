package inheritance;
/* Test 시나리오 
 * 일반고객 1명과 VIP고객 1명이 있습니다. 일반 고객의 이름은 이순신, 아이디는 10010,
 * 보너스 포인트는 1000점 입니다.
 * VIP고객의 이름은 김유신, 아이디는 10020, 보너스 포인트는 10000점입니다. 
 * 두 고객을 생성하고 이에 대한 고객 정보를 출력해보세요 */
public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		//customerLee.setCustomerName("이순신");
		//customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		 
		Customer customerKim = new VIPCustomer(10020, "김유신");
		//상위 클래스로 묵시적 형변환 
		//customerKim.setCustomerName("김유신");
		//customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		
	}

}
