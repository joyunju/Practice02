//알파벳을 입력받아 자음 모음을 구분하세요.
//switch~case문을 사용합니다.
//영문 소문자 이외의 입력값은 고려하지 않습니다.
//모음 : a, e, i, o u

package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 1글(소문자)를 입력하세요");
		System.out.print("알파벳 : ");
		// toLowerCase(); --> 입력된 문자열을 모두 소문자로 바꿔주는 역할
		String alphabet = sc.next().toLowerCase();

		switch (alphabet) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("모음입니다.");
			break;
		default:
			System.out.println("자음입니다.");
			break;
		}

		sc.close();
	}
}
