package a1026.student;


import java.util.ArrayList;
import java.util.Scanner;

public class StudentDAO {
    Scanner sc = new Scanner(System.in);

    private ArrayList<StudentDTO> slist;

    private StudentFile file = new StudentFile("student", "studentInfo");

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
        System.out.println("학생정보가 입력되었습니다.");
        slist.add(studentDTO);
    }
    private void delete(int index)
    {
        slist.remove(index);
        System.out.println("학생정보가 삭제되었습니다.");
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
    private void select(StudentDTO studentDTO){
        System.out.println("<학생 전체 자료 조회>");
        System.out.println(studentDTO.toString());
    }
    private void update(int index, StudentDTO studentDTO){
        slist.set(index, studentDTO);
        System.out.println("데이터 수정 완료!");
    }

    public void userInsert(){
        StudentDTO s = new StudentDTO();
        System.out.println("회원 정보를 입력하세요");
        System.out.println("학생 아이디:");
        s.setId(sc.nextInt());
        System.out.println("학생 이름:");
        s.setName(sc.next());
        System.out.println("학생 나이 : ");
        s.setAge(sc.nextInt());
        System.out.println("국어 점수 :");
        s.setKor(sc.nextInt());
        System.out.println("영어 점수 :");
        s.setEng(sc.nextInt());
        System.out.println("수학 점수 :");
        s.setMath(sc.nextInt());

        insert(s);
    }
    public void userSelect(){
        StudentDTO s = new StudentDTO();
        int index= find();
        if (index != -1){
           s.setId(slist.get(index).getId());
           s.setName(slist.get(index).getName());
           s.setAge(slist.get(index).getAge());
           s.setKor(slist.get(index).getKor());
           s.setEng(slist.get(index).getEng());
           s.setMath(slist.get(index).getMath());

           select(s);

        }else {
            System.out.println("회원정보를 찾을 수 없습니다.");
        }
    }
    public void userUpdate(){
        StudentDTO s = new StudentDTO();
        int index= find();
        if (index != -1) {
            System.out.println("회원 정보를 입력하세요");
            System.out.println("학생 아이디:");
            s.setId(sc.nextInt());
            System.out.println("학생 이름:");
            s.setName(sc.next());
            System.out.println("학생 나이 : ");
            s.setAge(sc.nextInt());
            System.out.println("국어 점수 :");
            s.setKor(sc.nextInt());
            System.out.println("영어 점수 :");
            s.setEng(sc.nextInt());
            System.out.println("수학 점수 :");
            s.setMath(sc.nextInt());
            update(index, s);
        }else {
            System.out.println("회원 정보를 찾을 수 없습니다.");
        }
    }

    public void userDelete(){
        int index = find();
        if (index != -1){
            delete(index);
        }else {
            System.out.println("회원정보를 찾을 수 없습니다.");
        }
    }
    public void printAll(){
        for (int i =0; i< slist.size();i++){
            System.out.println(slist.get(i).toString());
        }
    }
    public void dataSave() throws Exception {
        file.create();
        String data=" \t\t\t\t번호\t 이름\t 나이\t 주소\n";;
        for (int i=0; i<slist.size();i++){
            data += slist.get(i).toString()+"\n";
        }
        System.out.println("데이터 저장에 성공하였습니다.");
        file.write(data);
    }
    public void dataload(){
        try {
            file.read();
        }catch (Exception e){
            System.out.println("파일을 읽을 수 없습니다.");
        }


    }
}





