package A1006;

public class A1006_2 {
    public static void main(String[] args) {
//    배열 복사
//    System.arrayCopy(Object src, int srcPos, Object dest, int destPos, int length);
//    System.arrayCopy(원본 배열, 원본 배열 복사 시작 인덱스, 새 배열, 새 배열 붙여넣기 시작 인덱스, 복사 항목 수);

//        길이 3인 배열
        String[] oldStrArray = {"java", "array", "copy"};
//        길이 5인 배열을 새로 생성
        String[] newStrArray = new String[5];
//        배열 항목 복사
        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

//        newArray 출력 -> oldArray에서 카피된 항목을 제외하고는 초기값 Null을 가진다.
        for (int i = 0; i< newStrArray.length;i++){
            System.out.println(newStrArray[i]);
        }


    }
}
