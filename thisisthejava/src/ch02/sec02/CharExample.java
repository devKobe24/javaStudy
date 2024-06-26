package ch02.sec02;

// 하나의 문자를 작은따옴표(')로 감싼 것을 문자 리터럴이라고 함.
// 문자 리터럴은 유니코드로 변환되어 저장
// 유니코드는 세계 각국의 문자를 0 ~ 65535 숫자로 매핑한 국제 표준 규약.
// 자바는 이러한 유니코드를 저장할 수 있도록 "char" 타입을 재공.

// ========== 중요 포인트 ==========
// 유니코드가 정수이므로 char 타입도 정수 타입에 속함.
	// 때문에 char 변수에 작은따옴표로 감싼 문자가 아니라 유니코드 숫자를 직접 대입 가능
// ==============================

// ========== 중요 포인트 2 ==========
// char 타입의 변수에 어떤 문자도 대입하지 않고 단순히 초기화를 할 목적으로 작은따옴표(') 두 개를 연달아
// 붙인 빈(empty) 문자를 대입하면 컴파일 에러가 발생.
// ex) char c = ''; <- 컴파일 에러
//
// 이 경우에는 공백(유니코드:32) 하나를 포함해서 초기화해야 함.
// ex) char = ' '; <- 공백 하나를 포함해서 초기화
// ==============================

public class CharExample {
	public static void main(String[] args) {
		// 문자 저장.
		char c1 = 'A';

		// 유니코드 직접 저장.
		char c2 = 65;

		// 문자 저장.
		char c3 = '가';

		// 유니코드 직접 저장.
		char c4 = 44032;

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}
