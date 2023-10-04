package a0925.EX.kr.koreait.collectionTest;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2 {

	public static void main(String[] args) {
		
		HashSet<String> hset = new HashSet<String>();
		
		hset.add("홍길동");
		System.out.println(hset.size() + " : " + hset);
		hset.add("임꺽정");
		System.out.println(hset.size() + " : " + hset);
		hset.add("장길산");
		System.out.println(hset.size() + " : " + hset);
		hset.add("일지매");
		System.out.println(hset.size() + " : " + hset);
		hset.add("홍길동");
		System.out.println(hset.size() + " : " + hset);
		System.out.println("==============================================");
		
//		향상된 for를 사용해서 HashSet 객체에 저장된 데이터 1개씩 꺼내기
		for(String str : hset) {
			System.out.println(str);
		}
		System.out.println("==============================================");
		
//		Iterator 인터페이스는 HashSet 이나 TreeSet과 같이 입력하는 순서와 저장되는 순서가 달라서 get(), set() 메소드를 사용할 수 없는 객체를
//		iterator() 메소드로 분리해서 저장한다.
		Iterator<String> iterator = hset.iterator();
		
//		hasNext() : Iterator 인터페이스 객체에 다음에 읽어올 데이터가 있으면 true, 없으면 false를 리턴한다.
		while(iterator.hasNext()) {		// Iterator 인터페이스 객체에 다음에 읽어들일 데이터가 있는가?
//			next() : Iterator 인터페이스 객체에서 다음 데이터를 읽어온다.
			System.out.println(iterator.next());
		}
		System.out.println("==============================================");
		
		hset.remove("장길산");
		System.out.println(hset.size() + " : " + hset);
		hset.clear();
		System.out.println(hset.size() + " : " + hset);
		
	}
	
}












