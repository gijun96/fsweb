package arr_ex;

public class ex3 {
    public static void main(String[] args) {
//        배열 요소의 빈도수 계산
//        정수 배열과 정수 값 하나가 주어질 때, 배열에서
//        그 값의 빈도수를 계산하는 프로그램을 작성하세오.
        int[] numbers ={1, 2, 3, 2, 4, 2, 5};
        int targetValue = 2;
        int frequency =0;
        for (int i =0; i< numbers.length-1; i++){
            if (numbers[i] == targetValue){
                frequency += 1;
            }
        }
        System.out.println(frequency);



    }
}
