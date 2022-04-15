//Ex01 다음 코드는 오류가 있습니다. 오류의 내용을 찾고 올바르게 수정하여 코딩해 보세요.
package com.javaex.practice;

public class Ex01 {
	public static void main(String[] args) {
		
		int age = 15;
		
		//age가 0살 초과이고 18살 미만이면
		//아래가 오류인 이유 : 조건식을 합쳐서 쓸 수 없
		//if(0<age<18) {
		//수정
		if(0<age && age<18) {
			System.out.println("청소년입니다.");
		}
	}
}
