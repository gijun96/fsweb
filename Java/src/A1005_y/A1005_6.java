package A1005_y;

public class A1005_6 {
    public static void main(String[] args) {

        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

//        문자열 분리
        String[] tokens =board.split(",");

//        인덱스별로 읽기
        System.out.println(tokens[0]);
        System.out.println(tokens[1]);
        System.out.println(tokens[2]);
        System.out.println(tokens[3]);
        System.out.println();

//        for문을 이용한 읽기
        for(int i =0; i< tokens.length; i++){
            System.out.println(tokens[i]);
        }
    }
}
