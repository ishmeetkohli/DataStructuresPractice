/*
Given a list of substrings and an input string, determine whether the input string can be composed using the substrings.

e.g. Given "a", "man", "break", determine if "amanabreak" can be decomposed. Answer: Yes: "a" "man" "a" "break".

 */
package problems;

import java.util.Arrays;
import java.util.HashSet;

public class StringFromSubstring {


    static boolean isPossible(HashSet<String> dict, String word) {
        int currentIndex = 0;

        while(currentIndex <= word.length() && !dict.contains(word.substring(0, currentIndex))) {
            currentIndex++;
            if(currentIndex > word.length()) {
                return false;
            }
        }

        if(currentIndex == word.length()) {
            return true;
        }

        return isPossible(dict, word.substring(currentIndex, word.length()));

    }


    public static void main(String[] args) {
        String[] dictArray = {"a", "mana", "break"};
        HashSet<String> dict = new HashSet<>(Arrays.asList(dictArray));

        System.out.println(isPossible(dict, "amanabreak") ? "Yes" : "No");
    }

}
