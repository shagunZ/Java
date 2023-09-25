public class afteroccstr{
    public static void main(String[] args) {
        String inputString = "This is a sample text";
        String sequence = "sample";

        String result = fetchStringAfterSequence(inputString, sequence);
        System.out.println("Original : " + inputString);
        System.out.println(" after '" + sequence + "': " + result);
    }

    public static String fetchStringAfterSequence(String input, String sequence) {
        int index = input.indexOf(sequence);
        System.out.println(index);
String r = " ";
        if (index != -1) {
            // int startIndex = index + sequence.length();
            // return input.substring(startIndex);
            r = input.substring(index+sequence.length());
            return r;
        } else {
            return input;
        }
    }
}
