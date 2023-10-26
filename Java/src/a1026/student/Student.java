package a1026.student;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. 학생정보 입력");
            System.out.println("2. 학생정보 삭제");
            System.out.println("3. 학생정보 검색");
            System.out.println("4. 학생정보 수정");
            System.out.println("5. 학생정보 보기");
            System.out.println("6. 파일로 저장하기");
            System.out.println("7. 학생정보 파일 불러오기");
            System.out.println("0. 종료");

            System.out.println(">> ");

            int choice;
            try {
                choice = sc.nextInt();
            }catch (Exception e){
                choice = -1;
            }

            if (choice == 1){
                studentDAO.userInsert();
            }else if(choice == 2){
                studentDAO.userDelete();
            }else if(choice == 3){
                studentDAO.userSelect();
            }else if(choice == 4){
                studentDAO.userUpdate();
            }else if(choice == 5){
                studentDAO.printAll();
            }else if(choice == 6){
                try {
                    studentDAO.dataSave();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }else if(choice == 7){
                studentDAO.dataload();
            }else if(choice == 0){
                System.out.println("종료합니다.");
                sc.close();
                System.exit(0);
            }else{
                System.out.println("잘못입력하였습니다.");
            }
        }

    }
}
