package homework;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ShoppingTest {

	public static void main(String[] args) {
		
		Shopping shopping = new Shopping();
		Date date = new Date();
		//String s = date.toString();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy�� MM�� dd��");
		String s = simple.format(date);

		
		shopping.address = "����� �������� ���ǵ��� 20����";
		shopping.orderer = "ȫ���";
		shopping.ordererId = "abc123";
		shopping.orderNum = "201803120001";
		shopping.productNum="PD345-12";
		
		System.out.println("�ֹ� ��ȣ:"+shopping.orderNum);
		System.out.println("�ֹ��� ���̵�:"+shopping.ordererId);
		System.out.println("�ֹ���¥:"+s);
		System.out.println("�ֹ��� �̸�:"+shopping.orderer);
		System.out.println("�ֹ� ��ǰ ��ȣ:"+shopping.productNum);
		System.out.println("��� �ּ�:"+shopping.address);
		

	}

}
