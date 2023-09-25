package a0925.EX;
public class StringTest {

	public static void main(String[] args) {
		
//		자바는 기본 자료형으로 만든 변수는 일반 변수로 취급하고 클래스로 만든 변수(객체)는 참조형 변수로 취급한다.
		
//		자바의 기본 자료형
//		boolean : 1바이트, c++의 bool과 같은 기능을 한다. c++처럼 0과 1을 기억하는 것이 아니고 true, false를 기억한다.
//		byte : 1바이트, 데이터 전송에 사용한다.
//		char : 2바이트, 1문자, c++은 ascii 코드를 사용해서 한글, 한자를 2바이트로 처리하지만 자바는 모든 문자를 2바이트로 처리한다.
//		short : 2바이트, -32768 ~ 32767 사이의 정수를 기억한다.
//		int : 4바이트, -2147483648 ~ 2147483647 사이의 정수를 기억한다.
//		long : 8바이트, -2의 63승 ~ 2의 63승 -1 사이의 정수를 기억한다.
//		float : 4바이트, 단정도 실수, 소수점 아래로 6자리 정도를 표현한다.
//		double : 8바이트, 배정도 실수, 소수점 아래로 16자리 정도를 표현한다.
		
//		문자열 "AAA"가 처음 사용되므로 메모리 어딘가에 "AAA"를 만들고 시작 주소를 str1에 저장한다.		
		String str1 = "AAA";
//		"AAA"가 이미 메모리에 생성되어있는 상태이므로 메모리에 이미 생성되어있던 "AAA"의 주소를 str2에 저장한다.
		String str2 = "AAA";
		
		if (str1 == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
//		아래와 같이 new를 사용해서 "AAA"를 만들면 메모리에 "AAA"의 존재 여부와 관계없이 무조건 다시 만들어서 그 시작 주소를 str3에 할당한다.
		String str3 = new String("AAA");
		if (str1 == str3) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
//		"=="를 사용해서 같은가 비교할 수 있는 데이터는 기본 자료형 8가지와 null만 가능하다 => 객체는 "=="로 비교하면 안된다.
//		기본 자료형과 null을 제외한 나머지는 클래스로 생성한 객체이므로 참조 변수에 저장된 객체가 생성된 주소를 비교하게 된다. => 해시 코드를
//		비교한다.
		
//		결론 : 기본 자료형과 null을 제외한 클래스로 생성한 모든 객체는 "=="로 비고하면 안되고 equals() 메소드로 비교해야 한다.
		if (str1.equals(str3)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
	}
	
}














