import java.util.Scanner;

public class Algorithm09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        JeongSeung09 jeongSeung09 = new JeongSeung09();
        System.out.println(jeongSeung09.allSum(n));
    }
}

class JeongSeung09 {

    public int allSum(int n) {
        String str = Integer.toString(n);
        int sum = 0;
        for(int i=0; i<str.length(); i++) {
            int tmp = str.charAt(i) - '0';
            sum+=tmp;
        }
        return sum;
    }
}
