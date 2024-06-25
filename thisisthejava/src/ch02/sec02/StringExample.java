package ch02.sec02;

// 큰따옴표(")로 감싼 여러 개의 문자들은 유니코드로 변환되지 않습니다.
// 큰따옴표(")로 감싼 문자들을 문자열이라고 부릅니다.

// ================ 중요 포인트 ==============
// String 타입은 자바 기본 타입에 속하지 않는 참조 타입입니다.
// ========================================

// 문자열 내부에 역슬래쉬(\)가 붙은 문자를 사용할 수가 있습니다.
	// 이것을 이스케이프(escape) 문자라고 합니다.
	// 이스케이프 문자를 사용하면 특정 문자를 포함할 수 있고, 출력에 영향을 미치기도 합니다.

// 다음 예시 코드는 이스케이프 문자를 사용하는 방법을 보여줍니다.
	// 문자열에 큰따옴표를 넣기 위해 (\")를 사용했습니다.
	// 탭만큼 띄워 출력하기 위해 (\t)를 사용했습니다.
	// 다음 행으로 이동하기 위해 (\n)을 사용했습니다.

// Note: 역슬래쉬(\) 기호가 ￦로 표시될 수도 있는데, 이것은 폰트 때문이니 상관없습니다.
public class StringExample {
	public static void main(String[] args) {
		String name = "코비";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);

		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println(str);

		str = "번호\t이름\t직업";
		System.out.println(str);

		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다.");
	}
}
