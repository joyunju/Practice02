//숫자(정수) 3개를 입력받아 가장 작은 수를 출력하세요

package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력해주세요");

		System.out.print("숫자1: ");
		// 숫자를 입력 받기
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		System.out.print("숫자3: ");
		int num3 = sc.nextInt();

		// 조건문 안에 조건문 사용
		if (num1 < num2) {
			if (num1 < num3) {
				System.out.println("가장 작은수는 " + num1 + " 입니다.");
			} else {
				System.out.println("가장 작은수는 " + num3 + " 입니다.");
			}

		} else {
			if (num2 < num3) {
				System.out.println("가장 작은수는 " + num2 + " 입니다.");
			} else {
				System.out.println("가장 작은수는 " + num3 + " 입니다.");
			}

		}

		sc.close();
	}
}
