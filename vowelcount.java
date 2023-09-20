import java.util.*;

public class vowelcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        int a=0,e=0,i=0,o=0,u=0;
        for(int j=0;j<inp.length();j++){
            if(inp.charAt(j)=='a'||inp.charAt(j)=='A')a++;
            if(inp.charAt(j)=='e'||inp.charAt(j)=='E')e++;
            if(inp.charAt(j)=='i'||inp.charAt(j)=='I')i++;
            if(inp.charAt(j)=='o'||inp.charAt(j)=='O')o++;
            if(inp.charAt(j)=='u'||inp.charAt(j)=='U')u++;
        }
        System.out.println("a: "+a + " e:"+e + " i: "+i+" o: "+o+" u: "+u);
    }
}
