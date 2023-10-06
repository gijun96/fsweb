package A1006;

public class A1006_1 {
    public static void main(String[] args) {
//        길이 3인 배열
        int[] oldArray = {1, 2, 3};
//        길이 5인 배열을 새로 생성
        int[] newArray = new int[5];
//        배열 항목 복사
        for(int i = 0; i<oldArray.length;i++){
            newArray[i] = oldArray[i];
        }
//        oldArray에서 복사한 요소를 제외한 나머지는 배열의 초기값 0을 가진다.
        for (int k = 0; k< newArray.length;k++){
            System.out.println(newArray[k]);
        }
    }
}
