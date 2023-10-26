package a1026.student;

import a1026.sample.FileClass;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDAO {
    Scanner sc = new Scanner(System.in);

    private ArrayList<StudentDTO> slist;

    private FileClass file = new FileClass("student", "memberInfo");

    public StudentDAO() {
        slist = new ArrayList<StudentDTO>();

        StudentDTO s1 =new StudentDTO(0, "테스트1", 11, 100, 90, 80);
        StudentDTO s2 =new StudentDTO(1, "테스트2", 22, 90, 89, 91);
        StudentDTO s3 =new StudentDTO(2, "테스트3", 33, 85, 77, 55);
        StudentDTO s4 =new StudentDTO(3, "테스트4", 44, 77, 68, 85);

        slist.add(s1);
        slist.add(s2);
        slist.add(s3);
        slist.add(s4);
    }

    private void insert(StudentDTO studentDTO){
        slist.add(studentDTO);
    }
    private void delete(StudentDTO studentDTO){
        slist.remove(studentDTO);
    }
    private int find(){
        System.out.println("회원 이름을 입력해주세요.");
        String name = sc.next();
        for (int i=0; i< slist.size();i++){
            if (slist.get(i).getName().equals(name)){
             return i;
            }
        }
        return -1;
    }
    public void userInsert(){
        StudentDTO studentDTO = new StudentDTO();
        System.out.println("회원 정보를 입력하세요");
        System.out.println("학생 아이디:");
        int id = sc.nextInt();
        System.out.println("학생 이름:");
        String name = sc.next();
        System.out.println("학생 나이 : ");
        int age =sc.nextInt();
        System.out.println("국어 점수 :");
        int kor= sc.nextInt();
        System.out.println("영어 점수 :");
        int eng =sc.nextInt();
        System.out.println("수학 점수 :");
        int math = sc.nextInt();

        studentDTO.setId(id);
        studentDTO.setName(name);
        studentDTO.setAge(age);
        studentDTO.setKor(kor);
        studentDTO.setEng(eng);
        studentDTO.setMath(math);
        insert(studentDTO);
    }
    public void userDelete(){
        int index = find();
        if (index != -1){
            slist.remove(index);
        }else {
            System.out.println("회원정보를 찾을 수 없습니다.");
        }

    }
}





