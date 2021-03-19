package homework;

import java.util.Scanner;

public class Diamond {
	public static void main(String[] args) {
		System.out.println("홀수 값을 입력하세요:");
		
		Scanner scanner = new Scanner(System.in);
		int lineCount = scanner.nextInt();  //다른 홀수 값을 넣어보세요
		int spaceCount = lineCount/2 +1;
		int starCount = 1;
		
		
		for(int i = 0; i<lineCount; i++) {   //중첩 for문 lineCount줄 만큼 출력
			for(int j = 0; j<spaceCount; j++) { //spaceCount만큼 ' '이 한 줄에 출력됨 
				System.out.print(' ');  //i=0인 경우, spaceCount = 1
			}
			for(int j=0; j<starCount; j++) { //startCount만큼 '*'이 한 줄에 출력됨 
				System.out.print('*');    
			}
			for(int j = 0; j<spaceCount; j++) { //spaceCount만큼 ' '이 한 줄에 출력됨 
				System.out.print(' ');  //i=0인 경우, spaceCount = 1
			}
			
			if(i < lineCount/2) { // 입력 값의 반 보다 작은 수 , 가정  lineCount=5 i=0,1
				spaceCount-=1; 
				starCount+=2; 
			}
			else { // 입력 값의 반 보다 큰 수 
				spaceCount+=1;
				starCount-=2;
			}
			System.out.println();
		}
		}

}
