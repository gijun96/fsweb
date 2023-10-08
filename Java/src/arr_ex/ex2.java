package arr_ex;

public class ex2 {
    public static void main(String[] args) {
//        배열 요소의 빈도수 계산
//     주어진 실수 배열의 요소들의 합과 평균을 계산한느 프로그램을 작성하세요.
        double[] values = {1.5, 2.5, 3.0, 4.5, 5.0};
        double sum = 0;
        double avg = 0;
        for (int i =0; i< values.length-1;i++){
            sum += values[i];
        }
        System.out.println("총 합 : " + sum);
        System.out.println("평균 : " + (sum/ values.length));


    }
}
