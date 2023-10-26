package a1026.sample;

import java.util.ArrayList;
import java.util.Scanner;

public class DAO {
        Scanner sc = new Scanner(System.in);

        private ArrayList<MemberDTO> mlist;

        // file 직접 d: 저장하려면 클래스인 fileClass 만들예정
        private  FileClass file = new FileClass("sun", "memberInfo");
        // 생성자 constructor
    public DAO() {
        mlist =new ArrayList<MemberDTO>();

        //테스트용 데이터
        MemberDTO m1 = new MemberDTO(0, "test1", 11, "서울");
        MemberDTO m2 = new MemberDTO(1, "test2", 22, "대전");
        MemberDTO m3 = new MemberDTO(2, "test3", 33, "대구");
        MemberDTO m4 = new MemberDTO(3, "test4", 44, "부산");

        mlist.add(m1);
        mlist.add(m2);
        mlist.add(m3);
        mlist.add(m4);
    }
    // CRUD

// user 메서드: 사용자의 입력값있음.
    // userInsert
    private void insert(MemberDTO m){
        mlist.add(m);
    }
    private void delete(int index){
        System.out.println("회원을 삭제하였습니다.");
        mlist.remove(index);
    }


    //select (검색)
    private MemberDTO select(int index){
        return mlist.get(index);
    }
    // update(수정)
    private void update(int index, MemberDTO m){
        mlist.set(index, m);
    }


    // Create
    public void userInsert(){
        MemberDTO m =new MemberDTO();
        System.out.println("<회원 정보입력>");
        System.out.print("회원 번호 : ");
        int id = sc.nextInt();
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.println("주소 :");
        String address = sc.next();

        m.setId(id);
        m.setName(name);
        m.setAge(age);
        m.setAddress(address);
        insert(m);
    }

    //findIndex
//     인덱스 찾기: 키-이름
    private int findIndex(){
        System.out.println("회원 이름을 입력하세요.");
        String name = sc.next();
        for (int i =0;i<mlist.size();i++){
            if (mlist.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    // userSelect 멤버값 리턴하기
    public void userSelect(){
        int index = findIndex();
        if (index != -1){
            MemberDTO m= select(index);
             int id = m.getId();
             String name = m.getName();
             int age = m.getAge();
             String address = m.getAddress();
            System.out.println(m.toString());
        }else {
            System.out.println("해당 회원을 찾을 수 없습니다.");
        }
    }

    public void userUpdate(){
        int index = findIndex();
        MemberDTO m= new MemberDTO();
        if (index != -1){
            System.out.println("<기존 회원 정보>\n"+m.toString());
        System.out.println("<회원 정보수정>");
        System.out.print("회원 번호 : ");
            m.setId(sc.nextInt());
        System.out.print("이름 : ");
            m.setName(sc.next());
        System.out.print("나이 : ");
            m.setAge(sc.nextInt());
        System.out.println("주소 :");
            m.setAddress(sc.next());

        update(index,m);
        }else {
            System.out.println("해당 회원을 찾을 수 없습니다.");
        }
    }

    //user delete
    public  void userDelete(){
        int index = findIndex();
        if (index != -1){
            delete(index);
        }else {
            System.out.println("해당 회원을 찾을 수 없습니다.");
        }
    }
    // printAll - 전체 리스트 출력

    public void printAll(){
        System.out.println("<전체회원 목록>");
        int index = 1;
        for (int i =0; i<mlist.size();i++){
            System.out.println(index+"."+mlist.get(i).toString());
            index++;
        }
    }

    //File method
    public void dataSave() throws Exception{
        file.create();
        String str = " \t\t\t\t번호\t 이름\t 나이\t 주소\n";
        for (int i=0; i< mlist.size();i++){
            str += mlist.get(i).toString()+"\n";
        }
        System.out.println("데이터를 저장했습니다.");
        file.write(str);
    }
    public void dataload(){
        try {
            file.read();
        }catch (Exception e){
            System.out.println("파일을 읽을 수 없습니다.");
        }

    }
}




























