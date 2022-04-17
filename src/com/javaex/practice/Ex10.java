//사번(양의정수)을 입력하면 팀을 확인 할 수 있는 프로그램
//팀은 A팀, B팀, C팀 3개의 팀으로 구성합니다.
//팀을 방식은 사번을 3으로 나누어서 나머지가 0이면 A팀, 1이면 B팀, 2이면 C팀 으로 구분합니다.
//(사번 0은 고려하지 않습니다.)

package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("사번(정수)를 입력해주세요");

		System.out.print("사번: ");
		int num = sc.nextInt();
		int teamResult = num % 3;

		if (teamResult == 0) {
			System.out.println("A팀 입니다.");
		} else if (teamResult == 1) {
			System.out.println("B팀 입니다.");
		} else if (teamResult == 2) {
			System.out.println("C팀 입니다.");
		} else {
			System.out.println("잘못입력하셨습니다.");
		}

		sc.close();
	}
}