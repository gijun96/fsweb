package a1023;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian , 2011, 300),
                new Transaction(raoul , 2012, 1000),
                new Transaction(raoul , 2011, 400),
                new Transaction(mario , 2012, 710),
                new Transaction(mario , 2012, 700),
                new Transaction(alan , 2012, 950)
        );
//         2011년에 일어난 모든 트랜잭션을 찾아 값으로 오름차순으로 정의하시오.
            List<Transaction> transactionsIn2011 = transactions.stream()
                    .filter(transaction -> transaction.getYear() ==2011)
                    .sorted(Comparator.comparing(Transaction::getValue))
                    .collect(Collectors.toList());

        System.out.println(transactionsIn2011);

        // 거래자가 근무하는 도시 중복없이 나열
        List<String> transactions2 = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(transactions2);

        List<String> cities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(cities);


/*
*
map은 Java 스트림에서 요소를 변환하거나 매핑하는 데 사용되는 중요한 연산자 중 하나입니다. map 연산자는 스트림 내의 각 요소를 새로운 값으로 변환하거나 특정 함수 또는 매핑 작업을 적용하는 데 사용됩니다. 다음은 map을 사용하는 일반적인 상황과 용도입니다:

요소 변환: 스트림 내의 요소를 다른 형태로 변환할 때 map을 사용합니다. 예를 들어, 숫자 리스트에서 각 숫자를 제곱하는 경우:

java
Copy code
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> squaredNumbers = numbers.stream()
    .map(n -> n * n)
    .collect(Collectors.toList());
특정 속성 추출: 객체 목록에서 특정 속성을 추출하여 새로운 목록을 생성할 때 map을 사용합니다. 이는 객체에서 원하는 정보를 추출할 때 유용합니다.

java
Copy code
List<Person> people = ... // 어떤 객체 목록
List<String> names = people.stream()
    .map(Person::getName) // Person 객체에서 이름 추출
    .collect(Collectors.toList());
객체 변환: 객체를 다른 형식으로 변환하거나 특정 필드를 업데이트할 때 map을 사용합니다. 예를 들어, 날짜를 포맷팅하거나 필드를 수정하는 경우:

java
Copy code
List<Event> events = ... // 어떤 이벤트 목록
List<String> eventNames = events.stream()
    .map(event -> {
        event.setDescription(event.getDescription().toUpperCase()); // 설명을 대문자로 변경
        return event;
    })
    .map(Event::getName) // Event 객체를 이름 문자열로 변환
    .collect(Collectors.toList());
Optional 값을 추출: map은 Optional 객체 내에서 값을 추출할 때도 사용됩니다. 이것은 Optional을 통해 안전하게 값에 접근하는 데 도움이 됩니다.

java
Copy code
Optional<String> optionalValue = ... // 어떤 Optional
Optional<Integer> mappedValue = optionalValue.map(Integer::parseInt);
스트림 평면화: map은 스트림의 요소를 다른 스트림으로 매핑하는 데 사용되며, 이를 통해 스트림을 평면화할 수 있습니다. 이것은 스트림의 중첩 구조를 해제하거나 평탄화할 때 유용합니다.

java
Copy code
List<List<Integer>> nestedLists = ... // 중첩 리스트
List<Integer> flatList = nestedLists.stream()
    .flatMap(List::stream) // 중첩 리스트를 평탄화
    .collect(Collectors.toList());
map은 스트림 파이프라인에서 유용한 연산자 중 하나이며, 데이터 변환 및 가공을 위해 많은 상황에서 활용됩니다.
* */

    }
}
