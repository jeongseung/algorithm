package algo.algo1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("정승우", "1");
        Student stu2 = new Student("전수빈", "2");
        Student stu3 = new Student("정원석", "3");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        for(Student s : list) {
            System.out.println(s.getName());
            System.out.println(s.getNo());
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("계속 검색을 하고싶으면 y 아니면 n을 입력하시오 : ");
        String s = sc.next();
        while(true) {
            if(s.equals("y")) {
                System.out.println("검색하려는 학생이름을 쓰세요");
                String str = sc.next();
                boolean flag = false;
                for(Student stu : list) {
                    if(stu.getName().equals(str)) {
                        System.out.println(stu.getNo());
                        flag = true;
                        break;
                    }

                }
                if(flag == false) {
                    System.out.println("없는 학생입니다");
                }

            } else {
                break;
            }

        }


    }
}
