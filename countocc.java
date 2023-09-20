public class countocc{
    public static void main(String[] args) {
        String text = "This is a sample text. This is a sample text. This is a sample text. This is a sample text";
        String wordToCount = "text";

        int count = countOccurrences(text, wordToCount);

        System.out.println("Text: " + text);
        System.out.println("Word to count: " + wordToCount);
        System.out.println("Occurrences: " + count);

        // String targetWord = "This is";
        // int c = 0;
        // int index = text.indexOf(targetWord);
        // while(index!=-1){
        //     c++;
        //     index = text.indexOf(targetWord, index+1);
        // }
        //         System.out.println("Occurrences: " + targetWord + ": "+c);

    }

    public static int countOccurrences(String text, String word) {
        int count = 0;
        int index = 0;

        while (index != -1) {
            index = text.indexOf(word, index);

            if (index != -1) {
                count++;
                index += word.length();
            }
        }

        return count;
    }
}
