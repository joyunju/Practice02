//나이를 입력받아 19세이상 65세미만이면 1번그룹 그 외에는 2번 그룹으로 출력하는 프로그램 
package com.javaex.practice;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		int age;

		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이 : ");

		age = sc.nextInt();

		if (19<=age && age<=65) {
			System.out.print("\"1번 그룹\"");
		} else {
			System.out.print("\"2번 그룹\"");
		}
		System.out.println(" 입니다.");

		sc.close();
	}
	
}
