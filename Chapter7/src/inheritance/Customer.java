package inheritance;
//����� ����Ͽ� �������� ���α׷� ���� 
// ������ ��޿� ���� ����ȭ�� ���񽺸� ������ �� �ִ�.
// ������ ��޿� ���� ���η�, �������� �ٸ��� ����ȴ�.
public class Customer {

	private int customerID; //���� ���̵�
	private String customerName; //���� �̸�
	private String customerGrade; //���� ��� (�⺻ �����ڿ��� �����Ǵ� �⺻ ����� SILVER) 
	int bonusPoint; //���� ���ʽ� ����Ʈ (������ ��ǰ�� �����ϴ� ��� �����Ǵ� ���ʽ� ����Ʈ )
	double bonusRatio; // ���ʽ� ����Ʈ ���� ��� (������ ��ǰ�� ������ �� ���� �ݾ��� ���� ������ ���ʽ�
					   // Ʈ�� ����. �� �� ���Ǵ� ���� ���
					   // �⺻ �����ڿ��� �����Ǵ� ���� ������ 1%. 
				       //�� 10,000�� ¥���� ��� 100���� ����
	
	
	public Customer() { // �⺻ ������ 
		customerGrade = "SILVER"; //������� �ʱ�ȭ 
		bonusRatio = 0.01; 
	}
	
	public int calcPrice(int price) { //���� ����ϴ� �޼��� 
		bonusPoint += price * bonusRatio;  //���ʽ�����Ʈ ���� 
		return price;//������ ���� �� ������ ������ ��ȯ
	}
	
	public String showCustomerInfo() {
		return customerName  + "���� �����" + customerGrade+"�̸�, ������ ���ʽ� ����Ʈ��"+ bonusPoint+"�� �Դϴ�.";
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