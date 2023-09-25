package a0925.EX;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest2 {

	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) hh:mm:ss:SSS");
		System.out.println(sdf.format(date));
		
//		Date 클래스 객체에서 년, 월, 일, 시, 분, 초를 얻어오려면 get으로 시작하는 메소드를 사용하면 되고 수정하려면 set으로 시작하는 메소드를
//		사용한다.
//		Date 클래스는 1900년을 기준을 날짜를 처리한다.
//		년을 얻어올 때는 1900을 더해서 얻어와야 하고 넣어줄 때는 1900을 빼서 넣어줘야 한다.
//		월을 얻어올 때는 1을 더해서 얻어와야 하고 넣어줄 때는 1을 빼서 넣어줘야 한다.
		// System.out.println("년 : " + (date.getYear() + 1900));
		// System.out.println("월 : " + (date.getMonth() + 1));
		// System.out.println("일 : " + date.getDate());
		// System.out.println("요일 : " + date.getDay());		// 일요일 => 0, 월요일 => 1, ..., 토요일 => 6
		// System.out.println("시 : " + date.getHours());
		// System.out.println("분 : " + date.getMinutes());
		// System.out.println("초 : " + date.getSeconds());
		// System.out.println("================================================");
		
//		Calendar 클래스는 singleton 패턴으로 설계된 클래스로 객체를 만들어 사용할 수 없다.
//		객체를 만들어 사용할 수 없는 singleton 패턴으로 설계된 클래스는 클래스 내부에 자신으로 만든 객체를 포함하고 있어서 클래스 내부에 가지고
//		있는 자신의 객체를 얻어오는 메소드를 실행해 자신의 객체를 얻어와서 사용한다.
//		Calendar calendar = new Calendar();			// new를 사용해서 객체를 생성할 수 없어서 에러가 발생된다.
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
//		Calendar 클래스 객체는 날짜 및 시간 정보 이외에 더 만은 정보를 가지고 있기 때문에 SimpleDateFormat 클래스 객체를 이용해 서식을 지정하려면
//		getTime() 메소드로 날짜 및 시간 정보만 얻어와서 치리해야 한다.
//		System.out.println(sdf.format(calendar));	// 에러 발생
//		getTime() : Calendar 클래스 객체에서 날짜 및 시간 정보만 얻어온다.
		System.out.println(calendar.getTime());
		System.out.println(sdf.format(calendar.getTime()));
		
		System.out.println("년 : " + calendar.get(Calendar.YEAR));
		System.out.println("월 : " + (calendar.get(Calendar.MONTH) + 1));
		System.out.println("일 : " + calendar.get(Calendar.DATE));
		System.out.println("일 : " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일 : " + calendar.get(Calendar.DAY_OF_WEEK));		// 일요일 => 1, 월요일 => 2, ..., 토요일 => 7
		System.out.println("시(12시각) : " + calendar.get(Calendar.HOUR));
		System.out.println("시(24시각) : " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 : " + calendar.get(Calendar.MINUTE));
		System.out.println("초 : " + calendar.get(Calendar.SECOND));
		System.out.println("밀리초 : " + calendar.get(Calendar.MILLISECOND));
		
	}
	
}














