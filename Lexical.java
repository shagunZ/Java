public class Lexical {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";

        int minLength = Math.min(str1.length(), str2.length());
        int result = 0;

        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (char1 < char2) {
                result = -1;
                break;
            } else if (char1 > char2) {
                result = 1;
                break;
            }
        }

        if (result < 0) {
            System.out.println(str1 + " comes before " + str2);
        } else if (result > 0) {
            System.out.println(str2 + " comes before " + str1);
        } else {
            if (str1.length() < str2.length()) {
                System.out.println(str1 + " comes before " + str2);
            } else if (str1.length() > str2.length()) {
                System.out.println(str2 + " comes before " + str1);
            } else {
                System.out.println("Both strings are equal.");
            }
        }
    }
}
