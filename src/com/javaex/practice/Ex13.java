//다음과 같이 정의되는 함수의 함수값을 계산해보자
package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자 : ");
		
		int num = sc.nextInt();
		double mathResult;
		
		if(num>0) {
			mathResult = (7*num) +2;
			System.out.println("계산결과는 " + mathResult + " 입니다." );
		}else {
			mathResult = (num*num*num) - (9*num) +2;
			System.out.println("계산결과는 " + mathResult + " 입니다." );
		}
		
		sc.close();
	}

}
