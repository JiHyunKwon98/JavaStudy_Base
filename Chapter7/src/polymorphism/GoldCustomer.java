package polymorphism;

public class GoldCustomer extends Customer{

	double salesRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "GOLD";
		salesRatio = 0.1;
		bonusRatio = 0.02;
	}
	//재구현 해야하는 부분만 정의 
	public int calcPrice(int price) {
		bonusPoint +=price*bonusRatio;
		return price -(int)(price*salesRatio);
	}

}
