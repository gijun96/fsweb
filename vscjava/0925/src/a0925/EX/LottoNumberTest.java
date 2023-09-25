package a0925.EX;
import java.util.Random;

public class LottoNumberTest {

	public static void main(String[] args) {
		
//		추첨기를 만든다.
		int[] lotto = new int[45];
		
//		추첨기에 공을 넣는다.
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		
//		섞기전 상태를 출력한다.
		show(lotto);
		System.out.println("\n=====================================");
		
//		섞는다.
		Random random = new Random();
		for(int i = 0; i < 1000000; i++) {
			int r = random.nextInt(44) + 1;
			int temp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = temp;
		}
		
//		섞은후 상태를 출력한다.
		show(lotto);
		System.out.println("\n=====================================");
		
//		1등 번호를 출력한다.
		System.out.print("1등 번호 : ");
		for(int i = 0; i < 6; i++) {
			System.out.printf("%02d ", lotto[i]);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.printf("뽀나스 : %02d \n", lotto[6]);
		
	}

	private static void show(int[] lotto) {
		for(int i = 0; i < lotto.length; i++) {
			System.out.printf("%02d ", lotto[i]);
			if((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}
	
}








