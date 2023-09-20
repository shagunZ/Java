public class stringFunc {
    public static void main(String[] args) {
        String str1 = "hi";
        String str2 = "world";
        String str3="hi world";

        System.out.println("== operator: "+str1==str2); //references
        System.out.println("== operator: "+str1+str2==str3);

        String strconcat = str1.concat(str2);
        System.out.println("concat: "+ str1.equals(strconcat));

        boolean isequalIgnoreCase = str3.equalsIgnoreCase("hI WoRLD");
        System.out.println("equalIgnorecaase:" + isequalIgnoreCase);

        String sentence = "this is a sample sentence";
        String[] Words = sentence.split(" ");
        System.out.println("using spit: ");
        for(String Word:Words){
            System.out.println(Word);
        }

        int hashcode = str3.hashCode();
        System.out.println("using hashcode: "+ hashcode);

        String Substring = str3.substring(7);
        System.out.println("using substr: "+ Substring);

        String replacestr = str3.replace("World", "Earth");
        System.out.println("replacestr: "+replacestr);

        int indexword = str3.indexOf("Earth");
        System.out.println("indexword: "+ indexword);

        String uppercase = str3.toUpperCase();
        System.out.println("uppercase: "+uppercase);

        String lowercase = str3.toLowerCase();
        System.out.println("lowercase: "+lowercase);
    }
}
