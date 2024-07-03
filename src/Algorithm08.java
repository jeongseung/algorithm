import java.util.Scanner;

public class Algorithm08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        JeongSeung08 jeongSeung08 = new JeongSeung08();
        System.out.println(jeongSeung08.factorial(n));
    }
}

class JeongSeung08 {

    public int factorial(int n) {
        if(n == 0) return 0;
        int res = 1;
        for(int i=n; i>0; i--) {
            res*=i;
        }
        return res;
    }
}
