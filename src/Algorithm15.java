import java.util.Scanner;

public class Algorithm15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int f = sc.nextInt();
        JeongSeung15 jeongSeung15 = new JeongSeung15();
        jeongSeung15.gugu(s,f);

    }
}

class JeongSeung15 {

    void gugu(int s, int f) {
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=9; i++) {
            for(int j=s; j<=f; j++) {
                System.out.printf("%2d * %2d = %2d", j, i, j * i);
            }
            System.out.println();
        }
    }
}
