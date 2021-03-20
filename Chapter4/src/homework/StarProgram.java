package homework;

import java.util.Scanner;

public class StarProgram {
	//헷갈렸던 부분 다시 복습 및 응용 학습 완료
	public static void main(String[] args) {
		/* 다이아 
		Scanner scanner = new Scanner(System.in); 
		
		int num = scanner.nextInt();
		
		int starcount = 1;
		int spacecount = num/2 + 1;
		
		for(int i=0; i<num; i++) {
			
			for(int j=0; j<spacecount; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<starcount; j++) {
				System.out.print("*");
			}
			for(int j=0; j<spacecount; j++) {
				System.out.print(" ");
			}
			if(i < num/2) {
				spacecount -=1;
				starcount +=2;
				
			}else{
				spacecount +=1;
				starcount -=2;
			}
			System.out.println(" ");
		}
		
		*/
		/* 피라미드
		int starcount = 1;
		int spacecount = num - 1;
		
		for(int i=0; i<num; i++) {
			
			for(int j=0; j<spacecount; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<starcount; j++) {
				System.out.print("*");
			}
			for(int j=0; j<spacecount; j++) {
				System.out.print(" ");
			}
			spacecount-=1;
			starcount +=2;
			
			
			System.out.println(" ");
		}
		*/
		
		/* 직각삼각형
		for(int i=0; i<num; i++) { 
			for(int j=0; j<=i; j++) { 
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		
		for(int i=0; i<num; i++) { //i= 0,1,2
			for(int j=num; j>i; j--) { 
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
		*/
		
		

	}

}
