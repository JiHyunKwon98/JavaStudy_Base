package homework;

import java.util.Scanner;

public class Diamond {
	public static void main(String[] args) {
		System.out.println("Ȧ�� ���� �Է��ϼ���:");
		
		Scanner scanner = new Scanner(System.in);
		int lineCount = scanner.nextInt();  //�ٸ� Ȧ�� ���� �־����
		int spaceCount = lineCount/2 +1;
		int starCount = 1;
		
		
		for(int i = 0; i<lineCount; i++) {   //��ø for�� lineCount�� ��ŭ ���
			for(int j = 0; j<spaceCount; j++) { //spaceCount��ŭ ' '�� �� �ٿ� ��µ� 
				System.out.print(' ');  //i=0�� ���, spaceCount = 1
			}
			for(int j=0; j<starCount; j++) { //startCount��ŭ '*'�� �� �ٿ� ��µ� 
				System.out.print('*');    
			}
			for(int j = 0; j<spaceCount; j++) { //spaceCount��ŭ ' '�� �� �ٿ� ��µ� 
				System.out.print(' ');  //i=0�� ���, spaceCount = 1
			}
			
			if(i < lineCount/2) { // �Է� ���� �� ���� ���� �� , ����  lineCount=5 i=0,1
				spaceCount-=1; 
				starCount+=2; 
			}
			else { // �Է� ���� �� ���� ū �� 
				spaceCount+=1;
				starCount-=2;
			}
			System.out.println();
		}
		}

}
