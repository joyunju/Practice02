//아래와 같은 계산기 프로그램을 작성하세요.
//기호, 숫자1, 숫자2 순서로 입력받습니다.
//기호는 ( + - * / ) 4가지 입니다.
//입력된 내용으로 계산하여 결과값을 출력합니다.
//나눗셈의 경우 분모가 0이면 “계산할 수 없습니다” 를 출력합니다.

package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// scanner : 사용자로부터 키보드 입력을 받습니다
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호 : ");
		String sign = sc.next();

		System.out.print("숫자 1: ");
		int num1 = sc.nextInt();

		System.out.print("숫자 2: ");
		int num2 = sc.nextInt();

		double resultPlus = (double) (num1 + num2);
		double resultMinus = (double) (num1 - num2);
		double resulMultiplication = (double) (num1 * num2);
		double resultDivision = (double) (num1 / num2);

		// equals : 사용자가 입력한 부호값이 +,-,*,/ 와 같은지 확인합니다

		if (sign.equals("+")) {
			System.out.println("결과는 : " + resultPlus);
		} else if (sign.equals("-")) {
			System.out.println("결과는 : " + resultMinus);
		} else if (sign.equals("*")) {
			System.out.println("결과는 : " + resulMultiplication);
		} else if (sign.equals("/")) {
			
			if (num1 == 0 || num2 == 0) {
				System.out.println("계산할 수 없습니다.");
			} else {
				System.out.println("결과는 : " + resultDivision);
			}
		} else {
			System.out.println("잘못입력하셨습니다.");
		}

		sc.close();
	}

}
