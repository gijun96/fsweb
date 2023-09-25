package a0925.EX;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/*
		System.out.print("년, 월, 일 : ");
		int year = scanner.nextInt() - 1900;
		int month = scanner.nextInt() - 1;
		int day = scanner.nextInt();
		
		Date date = new Date(year, month, day);
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) hh:mm:ss:SSS");
		System.out.println(sdf.format(date));
		*/
		
		System.out.print("주민등록번호 : ");
		String juminNo = scanner.nextLine();
		
//		System.out.println(juminNo.substring(0, 2));	// 년
//		System.out.println(juminNo.substring(2, 4));	// 월
//		System.out.println(juminNo.substring(4, 6));	// 일
		
//		int year = (juminNo.substring(0, 2).charAt(0) - 48) * 10 + (juminNo.substring(0, 2).charAt(1) - '0');
//		int month = (juminNo.substring(2, 4).charAt(0) - 48) * 10 + (juminNo.substring(2, 4).charAt(1) - '0') - 1;
//		int day = (juminNo.substring(4, 6).charAt(0) - 48) * 10 + (juminNo.substring(4, 6).charAt(1) - '0');
		
//		Integer.parseInt() : 인수로 지정된 문자열을 정수로 바꾼다.
		int year = Integer.parseInt(juminNo.substring(0, 2));
		int month = Integer.parseInt(juminNo.substring(2, 4)) - 1;
		int day = Integer.parseInt(juminNo.substring(4, 6));
		
		if(juminNo.charAt(6) > '2') {
			year += 100;
		}
		
		Date date = new Date(year, month, day);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
		System.out.println(sdf.format(date));
		
	}
	
}












