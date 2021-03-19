package homework;

import java.util.Scanner;

public class CalProgram {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);;
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt(); 
		
		char operator = '/';
		
		/*
		if (operator == '+') {
			System.out.println(num1+num2);
		}else if (operator == '-') {
			System.out.println(num1-num2);
		}else if (operator == '*') {
			System.out.println(num1*num2);
		}else{
			System.out.println(num1/num2);
		}
		*/
		
		switch(operator) {
			case '+' : 
				System.out.println(num1+num2);
				break;
			case '-' : 
				System.out.println(num1-num2);
				break;
			case '*' : 
				System.out.println(num1*num2);
				break;
			default: 
				System.out.println(num1/num2);
				break;
		
		}
		
		
	}
}
