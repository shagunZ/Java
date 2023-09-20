public class capitalise {
    public static void main(String[] args) {
        String inputString = "capitalize me";

        String capitalizedString = capitalizeIndexes(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("Modified String: " + capitalizedString);
    }

    public static String capitalizeIndexes(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (i % 2 == 0) {
                result.append(Character.toUpperCase(currentChar));
            } else {
                result.append(Character.toLowerCase(currentChar));
            }
        }

        return result.toString();
    }
}
