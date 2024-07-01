import java.util.Scanner;

public class Algorithm07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        JeongSeung07 jeongSeung07 = new JeongSeung07();
        System.out.println(jeongSeung07.isPrime(n));


    }
}

class JeongSeung07 {

    public String isPrime(int n) {

        if(n==1) {
            return "1은 소수가 아닙니다";
        }
        if(n>=2) {
            for(int i=2; i<Math.sqrt(n); i++) {
                if(n%i==0) {
                    return n + "은 소수가 아닙니다";
                }
            }
        }
        return n +"은 소수입니다.";

    }
}

