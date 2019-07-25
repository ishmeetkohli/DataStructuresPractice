package july2019;

import java.util.HashSet;
import java.util.Set;

public class PalindromePermutation {
    public static void main(String[] args) {
        System.out.println(isPP("Tact Coa".toLowerCase()));
    }

    static boolean isPP(String input) {

        Set<Character> charSet = new HashSet();

        if(input == null) {
            return false;
        }

        if(input.length() < 2) {
            return true;
        }

        for(int i = 0 ; i < input.length() ; i++) {
            char current = input.charAt(i);

            if(current == ' '){
                continue;
            }

            if(charSet.contains(current)) {
                charSet.remove(current);
            } else {
                charSet.add(current);
            }
        }

        return charSet.size() > 1 ? false : true;

    }
}
