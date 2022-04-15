//Ex02 다음 코드는 오류가 있습니다. 오류의 내용을 찾고 올바르게 수정하여 코딩해 보세요.

package com.javaex.practice;

public class Ex02 {
	public static void main(String[] args) {
		
		int x = 0;
		
		//x가 0과 같으면
		//오류 이유 : 같다는 연산자 기호 ==
		//if(x=0) {
		// 수정코드
		if(x == 0 ) {
			System.out.println("x는 0이다.");
		}
	}
}
