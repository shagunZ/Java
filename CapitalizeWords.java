public class CapitalizeWords {
    public static void main(String[] args) {
        String inputString = "hello world how are you";

        // Split the input string into words
        String[] words = inputString.split(" ");

        // Create a StringBuilder to store the capitalized words
        StringBuilder resultBuilder = new StringBuilder();

        for (String word : words) {
            // Capitalize the first character of each word
            String capitalizedWord = capitalizeFirstCharacter(word);
            
            // Append the capitalized word to the result
            resultBuilder.append(capitalizedWord).append(" ");
        }

        // Convert the StringBuilder to a String and trim any trailing spaces
        String capitalizedString = resultBuilder.toString().trim();

        // Print the capitalized string
        System.out.println(capitalizedString);
    }

    // Function to capitalize the first character of a word
    private static String capitalizeFirstCharacter(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }
}
