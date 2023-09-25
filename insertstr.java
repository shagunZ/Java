public class insertstr {
    public static void main(String[] args) {
        String originalString = "Hello, world!";
        String stringToInsert = "beautiful ";

        int indexToInsert = 7; 

        // Using StringBuilder //better
        StringBuilder stringBuilder = new StringBuilder(originalString);
        stringBuilder.insert(indexToInsert, stringToInsert);
        String modifiedString = stringBuilder.toString();
        StringBuilder str = new StringBuilder("demostr");
        str.append("newdemo");
        System.out.println(str);
        str.delete(2, 4);
        System.out.println(str);

        System.out.println("Using StringBuilder: " + modifiedString);

        // Using StringBuffer (thread-safe version)
        StringBuffer stringBuffer = new StringBuffer(originalString);
        stringBuffer.insert(indexToInsert, stringToInsert);
        modifiedString = stringBuffer.toString();

        System.out.println("Using StringBuffer: " + modifiedString);
    }
}
