package ch02.sec02;

// 참과 거짓을 의미하는 논리 리터럴은 true와 false입니다.
// boolean 타입 변수는 주로 두 가지 상태값을 저장할 필요가 있을 경우에 사용됩니다.
	// 상태값에 따라 조건문과 제어문의 실행 흐름을 변경하는 데 사용됩니다.

// 다음 예시 코드는 stop 변수값에 따라 if 블록과 else 블록 중 하나를 실행하고,
// 연산식의 결과를 boolean 변수에 저장해서 출력하는 코드입니다.
public class BooleanExample {
	public static void main(String[] args) {
		boolean stop = true;
		if (stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다");
		}

		int x = 10;
		boolean result1 = (x == 20); // 변수 x의 값이 20인가?
		boolean result2 = (x != 20); // 변수 x의 값이 20이 아닌가?
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
	}
}
