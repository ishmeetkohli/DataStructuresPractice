package july2019;

public class URLify {

    public static void main(String[] args) {
        char[] input = "Mr John Smith    ".toCharArray();
        urlify(input, 13);
        System.out.println(input);
    }


    static void urlify(char[] input, int trueLength) {
        int i = trueLength - 1, j = input.length - 1;

        while(i > 0) {
            if (input[i] == ' ') {
                input[j--] = '0';
                input[j--] = '2';
                input[j--] = '%';
                i--;
            } else {
                input[j--] = input[i--];
            }
        }

    }
}
