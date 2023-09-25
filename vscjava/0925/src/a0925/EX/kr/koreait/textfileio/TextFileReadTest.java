package a0925.EX.kr.koreait.textfileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileReadTest {

	public static void main(String[] args) {
		
		Scanner scanner = null;
		
//		입력 파일의 경로와 이름을 설정한다.
//		out.txt => TextFileWriteTest.java에서 만든 파일, input.txt => 이클립스에서 만든 파일, in.txt => 윈도우에서 만든 파일
//		java 프로그램으로 생성한 텍스트 파일이나 이클립스에서 생성한 텍스트 파일은 잘 읽어오지만 윈도우에서 생성한 텍스트 파일은 읽어오지 못하는
//		경우가 발생된다. 이럴 경우 메모장으로 파일을 열고 파일 메뉴 => 다른 이름으로 저장을 클릭하고 인코딩을 ANSI => UTF-8로 변경한다.
		String filename = "./src/kr/koreait/textfileio/in.txt";
		
		try {
//			Scanner 클래스 객체를 생성해서 지정된 경로의 입력으로 사용할 파일을 open 한다.
//			scanner = new Scanner(filename);		// 파일의 내용이 아닌 filename 변수에 저장된 문자열을 읽어들이는 Scanner가 된다.
//			Scanner로 텍스트 파일의 데이터를 읽어오려면 Scanner 클래스 생성자의 인수로 파일의 경로와 이름을 이용해서 File 클래스 객체를 생성해서
//			넘겨줘야 한다.
			scanner = new Scanner(new File(filename));
			
//			인코딩을 ANSI 에서 UTF-8로 변경한 후 읽었을 때 첫 줄에 이상한 문자가 나오거나 빈 줄이 나오면 첫 줄을 읽어서 버리면 된다.
			scanner.nextLine();
			
//			텍스트 파일에서 더 이상 읽을 데이터(줄)가 없을 때 까지 반복하며 읽어들인다.
//			hasNextLine() : 스캐너로 지정된 파일에서 읽어들일 데이터(줄)가 있으면 true, 없으면 false를 리턴시킨다.
			while(scanner.hasNextLine()) {			// 파일에서 다음에 읽어들일 데이터(줄)가 있는가?
				String str = scanner.nextLine().trim();
				System.out.println(str);
				
//				String 변수에 저장된 문자열 데이터를 읽어들이는 Scanner
				Scanner scan = new Scanner(str);
//				String 변수에서 더 이상 읽을 데이터(공백으로 구분된)가 없을 때 까지 반복하며 읽어들인다.
//				hasNext() : 스캐너로 지정된 String 변수에서 다음에 공백으로 구분된 읽어들일 데이터가 있으면 true, 없으면 false를 리턴한다.
				
				int i = 0;
				boolean b = false;
				double d = 0;
				String s = "";
				
				while(scan.hasNext()) {					// String 변수에서 다음에 읽어들일 데이터가 있는가?
//					System.out.println(scan.next());
					if(scan.hasNextInt()) {				// 스캐너로 읽을 데이터가 정수인가?
						i = scan.nextInt();
					} else if(scan.hasNextBoolean()) {	// 스캐너로 읽을 데이터가 논리값인가?
						b = scan.nextBoolean();
					} else if(scan.hasNextDouble()) {	// 스캐너로 읽을 데이터가 실수인가?
						d = scan.nextDouble();
					} else {
						s = scan.next();
					}
//					i = scan.nextInt();
//					b = scan.nextBoolean();
//					d = scan.nextDouble();
//					s = scan.next();
				}
				
				System.out.println("i = " + i);
				System.out.println("b = " + b);
				System.out.println("d = " + d);
				System.out.println("s = " + s);
				System.out.println("==================");
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("디스크의 지정된 경로에 파일이 존재하지 않습니다.");
			e.printStackTrace();
		} finally {
			if(scanner != null) {
				scanner.close();
			}
		}
		
	}
	
}











