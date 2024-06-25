package ch02.sec02;

// Java 13부터는 다음과 같은 텍스트 블록 문법을 제공합니다.
/*
String str = """
...
"""
 */

// 큰따옴표 3개로 감싸면 이스케이프하거나 라인피드를 할 필요가 없이 작성된 그대로 문자열로 저장됩니다.

// 다음 예시 코드에서 str1과 str2는 동일한 문자열이 저장됩니다.

// 텍스트 블록에서 줄바꿈은 (\n)에 해당합니다.
// 만약 줄바꿈을 하지 않고 다음 줄에 이어서 작성하고 싶다면 맨 끝에 (\)를 붙여주면 됩니다.
	// 이 기능은 Java 14부터 제공됩니다.
public class TextBlockExample {

	public static void main(String[] args) {
		String str1 = "" +
				"{\n" +
				"\t\"id\":\"winter\",\n" +
				"\t\"name\":\"눈송이\",\n" +
				"}";

		String str2 = """
    {
    "id":"winter",
    "name":"눈송이"
    }
    """;

		System.out.println(str1);
		System.out.println("------------------------------");
		System.out.println(str2);
		System.out.println("------------------------------");

		String str = """
    {
    나는 자바를 \
    학습합니다.
    나는 자바 고수가 될 겁니다.
    }
    """;
		System.out.println(str);
	}
}
