package inheritance;
/*
 * Customer�� ��ӹ޾� �����ϴ� VIPCustomer Ŭ����
 * VIPCustomer Ŭ������ ���
 * �ܰ������ ������ �� �پ�����
 * ��ǰ ���Ž� 10% ����
 * ���ʽ� ����Ʈ 5%����
 * ��� ���� ����
 * Customer class�� ����������, �׺��� �� ���� �Ӽ��� ����� �ʿ� 
*/
public class VIPCustomer extends Customer {
	
	double salesRatio;
	private int agentID;
	
	/*
	public VIPCustomer() {
		
		super(); //���� Ŭ������ �������� ���� ����  ����Ŭ������ �⺻������ ȣ��
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.01;
		
		System.out.println("VIPCustomer() ������ ȣ��");
	}*/
	
	public VIPCustomer(int customerID, String customerName) {
		
		super(customerID, customerName); 
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.01;
		
		System.out.println("VIPCustomer() ������ ȣ��");
	}
	
}
