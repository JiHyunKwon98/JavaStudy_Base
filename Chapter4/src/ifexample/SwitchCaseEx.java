package ifexample;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int rank = scanner.nextInt();
		char medalColor;
		
		switch(rank) {
			case 1: medalColor = 'G';
				System.out.println("금매달");
				break;
			case 2: medalColor = 'S';
				System.out.println("은매달");
				break;
			case 3: medalColor = 'B';
				System.out.println("동1매달");
				break;
			default : medalColor = 'A'; //기본값, 초기값은 항상 지정해줘야한다.
		}
		
		System.out.println(rank+"등은"+medalColor+"매달 입니다.");

	}

}
