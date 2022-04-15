//(예상한 후 코드를 작성해 확인해 보세요)
// 나이 15 19 20 21 100

package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		int age;

		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이 : ");

		age = sc.nextInt();

		if (age > 20) {
			System.out.println("\"1번 그룹\"");
		} else {
			System.out.println("\"2번 그룹\"");
		}
		System.out.println("입니다.");

		sc.close();

	}
}
