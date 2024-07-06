import java.util.Scanner;

public class Algorithm05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        JeongSeung05 jeongSeung05 = new JeongSeung05();
        jeongSeung05.caseTrans(str);
    }
}

class JeongSeung05 {

    void caseTrans(String str) {
        StringBuilder sb = new StringBuilder();
        char c = 0;
        for(int i=0; i<str.length(); i++) {

            if(str.charAt(i) < 92) {
                c = (char) (str.charAt(i) + 32);
            } else {
                c = (char) (str.charAt(i) - 32);
            }
            sb.append(c);
        }
        System.out.println(sb);
    }
}