package homework;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ShoppingTest {

	public static void main(String[] args) {
		
		Shopping shopping = new Shopping();
		Date date = new Date();
		//String s = date.toString();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일");
		String s = simple.format(date);

		
		shopping.address = "서울시 영등포구 여의도동 20번지";
		shopping.orderer = "홍길순";
		shopping.ordererId = "abc123";
		shopping.orderNum = "201803120001";
		shopping.productNum="PD345-12";
		
		System.out.println("주문 번호:"+shopping.orderNum);
		System.out.println("주문자 아이디:"+shopping.ordererId);
		System.out.println("주문날짜:"+s);
		System.out.println("주문자 이름:"+shopping.orderer);
		System.out.println("주문 상품 번호:"+shopping.productNum);
		System.out.println("배송 주소:"+shopping.address);
		

	}

}
