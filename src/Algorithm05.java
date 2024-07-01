public class Algorithm05 {
    public static void main(String[] args) {
        String str = "helloWorlD";
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)<96) {
                char c = (char)(str.charAt(i) + 32);
                sb.append(c);
            } else {
                char c = (char)(str.charAt(i) -32);
                sb.append(c);
            }
        }
        System.out.println(sb);

    }

}
