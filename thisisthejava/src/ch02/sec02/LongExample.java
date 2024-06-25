package ch02.sec02;

// long 타입은 수치가 큰 데이터를 다루는 프로그램에서 사용.
	// ex) 은행, 과학 분야 등등...
// 기본적으로 컴파일러는 정수 리터럴을 int 타입 값으로 간주하기 때문에,
// int 타입의 허용 범위(-2,147,483,648 ~ 2,147,483,647)를 초과시 리터럴은 뒤에 소문자 'l'이나 대문자 'L'을 붙여
// long 타입 값임을 컴파일러에게 알려줘야 함.

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
//		long var3 = 1000000000000; // 컴파일러는 int로 간주하므로 에러 발생
		long var4 = 1000000000000L;

		System.out.println(var1);
		System.out.println(var2);
//		System.out.println(var3);
		System.out.println(var4);
	}
}
