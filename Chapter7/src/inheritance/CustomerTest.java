package inheritance;
/* Test �ó����� 
 * �Ϲݰ��� 1���� VIP���� 1���� �ֽ��ϴ�. �Ϲ� ������ �̸��� �̼���, ���̵�� 10010,
 * ���ʽ� ����Ʈ�� 1000�� �Դϴ�.
 * VIP������ �̸��� ������, ���̵�� 10020, ���ʽ� ����Ʈ�� 10000���Դϴ�. 
 * �� ������ �����ϰ� �̿� ���� ���� ������ ����غ����� */
public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerName("�̼���");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("������");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
	}

}