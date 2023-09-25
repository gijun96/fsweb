package a0925.EX;
import java.util.Random;
import java.util.Scanner;

public class LottoNumberTest2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] lotto = new int[45];
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("복권 구매 금액을 입력하세요 : ");
		int money = scanner.nextInt();
		
//		==========================================================================
		
		for(int j = 0; j < money / 1000; j++) {
			
			for(int i = 0; i < 1000000; i++) {
				int r = random.nextInt(44) + 1;
				int temp = lotto[0];
				lotto[0] = lotto[r];
				lotto[r] = temp;
			}
			
			System.out.printf("%3d GAME : ", j + 1);
			for(int i = 0; i < 6; i++) {
				System.out.printf("%02d ", lotto[i]);
			}
			System.out.println();
			
		}
		
	}

}








