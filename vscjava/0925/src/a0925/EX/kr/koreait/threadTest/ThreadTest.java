package a0925.EX.kr.koreait.threadTest;

public class ThreadTest {

	public static void main(String[] args) {
		
//		<< Thread 클래스를 상속받아 작성된 스레드 실행 방법 >>
//		1. Thread 클래스를 상속받아 스레드를 작성한 클래스의 객체를 만든다.
		DigitThtead digit = new DigitThtead();
//		2. 생성된 Thread 클래스를 상속받아 작성된 클래스 객체에서 start() 메소드로 스레드를 실행한다.
//		digit.run();		// 멀티 스레드가 실행되는 것이 아니고 run() 이라는 일반 메소드가 실행된다.
		digit.start();
		
//		위의 주석으로 처리하지 않은 2개의 문장을 아래와 같이 1문장으로 줄여서 사용할 수 있다.
//		new DigitThtead().start();
		
//		<< Runnable 인터페이스를 구현받아 작성된 스레드 실행 방법 >>
//		1. Runnable 인터페이스를 구현받아 스레드를 작성한 클래스의 객체를 만든다.
		AlphaThread alpha = new AlphaThread();
//		2. Runnable 인터페이스는 스레드를 실제로 실행하는 기능이 없으므로 스레드를 실행하기 위해서 Thread 클래스를 이용해야 한다.
//		   Thread 클래스의 객체를 생성한다. => 생성자의 인수로 Runnable 인터페이스를 구현받아 스레드를 작성한 클래스 객체를 넘겨준다.
		Thread thread = new Thread(alpha);
//		3. Thread 클래스 객체에서 start() 메소드로 스레드를 실행한다.
		thread.start();
		
//		위의 주석으로 처리하지 않은 3개의 문장을 아래와 같이 1문장으로 줄여서 사용할 수 있다.
//		new Thread(new AlphaThread()).start();
		
//		'A' ~ 'Z'를 0.2초 간격으로 출력한다.
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
			try { Thread.sleep(200); } catch (InterruptedException e) {	e.printStackTrace(); }
		}
		
	}
	
}









