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
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.01;
	}
	
}
