package a1011.StudentTest;

public class StudentTest {
    public static void main(String[] args) {
        Student park =new Student(20191011, "Park");
        Student kim =new Student(20191012, "Kim");
        Student lee =new Student(20221012, "Lee");

        System.out.printf("Student 객체의 수 : %d\n", Student.count);
    }
}
class Student{

    static int count =0; //클래스 변수, static 필드, 정적변수, 공용변수
    int id; // 인스턴스 변수
    String name;
    int index;
    Student(int _id, String _name){
        Student.count++;
        id = _id;
        name = _name;
        index = count;
        System.out.printf("%d. id: %d, name: %s\n",index, id, name);
    }

}