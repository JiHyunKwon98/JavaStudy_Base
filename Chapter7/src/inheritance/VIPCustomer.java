package inheritance;
/*
 * Customer를 상속받아 구현하는 VIPCustomer 클래스
 * VIPCustomer 클래스의 기능
 * 단골고객으로 혜택이 더 다양해짐
 * 제품 구매시 10% 할인
 * 보너스 포인트 5%적립
 * 담당 상담원 배정
 * Customer class와 유사하지만, 그보다 더 많은 속성과 기능이 필요 
*/
public class VIPCustomer extends Customer {
	
	double salesRatio;
	private int agentID;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.01;
	}
	
}
