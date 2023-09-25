package a0925.EX;
import java.util.Scanner;
public class ScannerTest2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = scanner.nextInt();
		
//		키보드 버퍼를 비운다.
		scanner.nextLine();
		
		System.out.print("이름 : ");
		String name = scanner.nextLine();
		
		System.out.println(name + "님은 " + age + "살 입니다.");
		System.out.println(name + "님은 내년에 " + (age + 1) + "살 입니다.");
		
	}
	
}
