public class StringMain {
    public static void main(String[] args) {
        String str = "Ritwik";

        System.out.println(reverseBySwapping(str.toCharArray()));
        System.out.println(reverseByLoop("Ritwik"));
        System.out.println(reverseByStringBuilder("Ritwik"));
        System.out.println(removeSlashes("https://example.com///////////"));

    }

    public static String removeSlashes(String str) {
        String cleanURL = str.replaceAll("/+$", "");
        return cleanURL;
    }

    public static String reverseByStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);

        return sb.reverse().toString();
    }
    public static String reverseByLoop(String str) {
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }

        return rev;

    }
    public static String reverseBySwapping(char[] str) {
        int f = 0;
        int l = str.length-1;

        while(f<l){
            char temp = str[f];
            str[f] = str[l];
            str[l] = temp;
            f++;
            l--;
        }
        return String.valueOf(str);
    }
}
