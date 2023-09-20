import java.util.*;

public class replaceevenbynexteven {

   public static void replaceEven(String str){
    char [] charArray = str.toCharArray();
    for(int i=0;i<charArray.length;i++){
        if(i%2==0){
            if(i+2>=charArray.length){
                charArray[i] = 1;
            }
            else charArray[i] = charArray[i+2];
        }
    }

    String repString = new String(charArray);
    System.out.println(repString);
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String inp = sc.nextLine();
        replaceEven(inp);
    }
}
