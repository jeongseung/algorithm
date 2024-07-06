import java.util.Scanner;

public class Algorithm14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        JeongSeung14 jeongSeung14 = new JeongSeung14();
        int[] arr = jeongSeung14.conversion(str);
        for(int i=0; i<arr.length; i++) {
            System.out.println(i+": " +arr[i]);
        }
    }
}

class JeongSeung14 {

    int[] conversion (String str) {
        int[] arr = new int[10];
        for(int i=0; i<str.length(); i++) {
            int c = str.charAt(i) - '0';
            arr[c]++;
        }
        return arr;
    }

}


