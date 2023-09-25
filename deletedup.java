public class deletedup {
    public static String removeDuplicates(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!result.toString().contains(word)) {
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "programming is fun and programming is cool";
        String withoutDuplicates = removeDuplicates(input);
        System.out.println("Original: " + input);
        System.out.println("Without Duplicates: " + withoutDuplicates);
    }
}
