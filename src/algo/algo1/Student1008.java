package algo.algo1;

import java.util.ArrayList;
import java.util.Scanner;

public class Student1008 {
    private String name;
    private String no;


    public Student1008(String name, String no) {
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", no='" + no + '\'' +
                '}';

    }
    public static void main(String[] args) {
        ArrayList<Student1008> list = new ArrayList<>();
        Student1008 stu1 = new Student1008("정승우", "1");
        Student1008 stu2 = new Student1008("전수빈", "2");
        Student1008 stu3 = new Student1008("정원석", "3");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        for(Student1008 s : list) {
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
                for(Student1008 stu : list) {
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
