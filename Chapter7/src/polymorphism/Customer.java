package polymorphism;
/*상속을 사용하여 고객관리 프로그램 구현 
 *  고객의 등급에 따라 차별화된 서비스를 제공할 수 있다.
 *  고객의 등급에 따라 할인률, 적립금이 다르게 적용된다.*/ 

//Customer 하나로 관리 
public class Customer {

	protected int customerID; //고객 아이디
	protected String customerName; //고객 이름
	protected String customerGrade; //고객 등급 (기본 생서자에서 지정되는 기본 등급은 SILVER) 
	int bonusPoint; //고객 보너스 포인트 (고객이 제품을 구매하는 경우 누적되는 보너스 포인트 )
	double bonusRatio; // 보너스 포인트 적립 비용 (고객이 제품을 구매할 때 구매 금액의 일정 비율이 보너스
					   // 트로 적립. 이 때 계산되는 적립 비용
					   // 기본 생성자에서 지정되는 적립 비율은 1%. 
				       //즉 10,000원 짜리를 사면 100원이 적립
/*
	public Customer() { // 기본 생성자 
		customerGrade = "SILVER"; //멤버변수 초기화 
		bonusRatio = 0.01; 
		
		System.out.println("Customer() 생성자 호출");
	}
*/	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER"; //멤버변수 초기화 
		bonusRatio = 0.01; 
		
		//System.out.println("Customer(int, String) 생성자 호출");

	}
	
	public int calcPrice(int price) { //가격 계산하는 메서드 
		bonusPoint += price * bonusRatio;  //보너스포인트 적립 
		return price;//가격을 받은 후 지불할 가격을 반환
	}
	
	public String showCustomerInfo() {
		return customerName  + "님의 등급은" + customerGrade+"이며, 적립된 보너스 포인트는"+ bonusPoint+"점 입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	
	
}
