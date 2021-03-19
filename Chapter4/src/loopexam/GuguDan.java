package loopexam;

public class GuguDan {

	public static void main(String[] args) {
	
		/*
		int num = 1;
		int res = 1;
		
		for(int i=1; i<=9; i++) {
			for(num = 1; num<=9; num++) {
				res = i*num;
				System.out.println(i+"*"+num+"="+res );
			}
		}
		
		
		int dan;
		int count;
		
		for(dan = 2; dan <=9; dan++) {
			for(count =1; count<=9; count++) {
				System.out.println(dan+"x"+count + "="+dan*count);
			}
			System.out.println();
		}
		
		
		int dan = 1;
		while(dan<=9) {	
			int count = 1;
			while(count<=9) {
			System.out.println(dan+"x"+count + "="+dan*count);
			count++;
			}
			dan++;
			System.out.println();
		}
		*/
		
		int dan ;
		int count;
		for(dan=1; dan<=9; dan++) {
			if((dan%2)!= 0) continue;
			for(count =1; count<=9; count++) {
				if(count > dan) break;
				System.out.println(dan+"x"+count + "="+dan*count);
			}
			System.out.println();
		}
		
		
		
		
	}

}
