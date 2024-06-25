package ch02.sec02;

// 컴파일러는 실수 리터럴을 기본적으로 double 타입으로 해석.
	// 때문에 double 타입 변수에 대입해야 함.
// float 타입에 대입하고 싶다면 리터럴 뒤에 소문자 'f'나 대문자 'F'를 붙여
// 컴파일러가 float 타입임을 알 수 있도록 해야 함.

// 아래 예시 코드는 float과 double 타입 소수 이하 유효 자릿수를 확인하는 코드.
// double 타입은 float 타입 보다 약 2배 유효 자릿수를 가지기 때문에 보다 정확한 데이터 저장이 가능.
// double이라는 이름도 float보다 약 2배의 정밀도를 갖는다는 의미에서 붙여진 것.
public class FloatDoubleExample {
	public static void main(String[] args) {
		// 정밀도 확인
		float var1 = 0.1234567880123456789f;
		double var2 = 0.1234567880123456789;
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2); // double 타입이 float 타입보다 약 2배 정도의 유효 자릿수를 가집니다.

		// 10의 거듭제곱 리터럴
		double var3 = 3e6;
		float var4 = 3e6F;
		double var5 = 2e-3;
		System.out.println("var3 = " + var3);
		System.out.println("var4 = " + var4);
		System.out.println("var5 = " + var5);
	}
}
