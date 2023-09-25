package a0925.EX;
public class ArrayTest {

	public static void main(String[] args) {
		
//		자료형[] 배열이름 = new 자료형[첨자];		// 배열만 선언한다. 초기화시키지 않아도 자동으로 초기화 된다.
//		자료형 배열이름[] = new 자료형[첨자];		// 숫자는 0, 문자는 공백, boolean은 false, 기타 클래스로 선언한 배열은 null로 초기화 된다.
		
		int[] data = new int[10];
		
//		배열이름.length => 배열의 크기를 얻어온다.
		System.out.println("배열의 크기 : " + data.length);
		for(int i = 0; i < data.length; i++) {
			System.out.println("data[" + i + "] = " + data[i]);
		}
		System.out.println("========================================");
		
//		자료형[] 배열이름 = {초기치};				// 배열이 초기치의 개수 만큼 선언되고 초기치로 초기화 된다.
		int[] score = {100, 85, 74, 96, 51};
		System.out.println("배열의 크기 : " + score.length);
		for(int i = 0; i < score.length; i++) {
			System.out.println("score[" + i + "] = " + score[i]);
		}
		
		
	}
	
}
