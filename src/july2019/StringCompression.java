package july2019;

public class StringCompression {

    public static void main(String[] args) {

        System.out.println(compress("aabcccccaaa"));
    }

    static String compress(String input) {
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < input.length()) {
            char current = input.charAt(i);
            int currentCount = 1;

            while (i < input.length() - 1 && current == input.charAt(i+1)) {
                i++;
                currentCount++;
            }

            result.append(current + String.valueOf(currentCount));
            i++;
        }

        return result.length() >= input.length() ? input : result.toString();
    }

}
