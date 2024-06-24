package ch02.sec01;

// ========================== 중요 포인트 ========================
// 변수는 또 다른 변수에 대입되어 메모리 간에 값을 "복사(Copy)"할 수 있습니다.
// ============================================================

// 다음 예제는 두 변수의 값을 교환하는 방법을 보여줍니다.
// 두 변수의 값을 교환하기 위해서 새로운 변수 'temp'를 선언한 것에 주목하십시오.
public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);

		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
	}
}
