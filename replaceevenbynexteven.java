import java.util.*;

public class replaceevenbynexteven {

    public static void replaceEven(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 == 0) {
                if (i + 1 >= charArray.length) {
                    charArray[i] = '1'; // Replace with '1' if there is no next even position
                } else {
                    charArray[i] = charArray[i + 2]; // Replace with next even position character
                }
            }
        }

        String repString = new String(charArray);
        System.out.println(repString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inp = sc.nextLine();
        replaceEven(inp);
    }
}
