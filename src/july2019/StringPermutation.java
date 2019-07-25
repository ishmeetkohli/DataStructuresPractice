package july2019;

import java.util.HashMap;
import java.util.Map;

public class StringPermutation {

    public static void main(String[] args) {

        System.out.println(isPermutation("moon", "oonm"));
    }

    static boolean isPermutation(String s1, String s2) {

        if(s1 == null && s2==null) {
            return true;
        }

        if(s1.length()!=s2.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap();


        for(int i = 0; i < s1.length(); i++) {

            char current = s1.charAt(i);

            if (map.containsKey(current)) {
                map.put(current, map.get(current) + 1);
            } else {
                map.put(current, 1);
            }
        }

        for(int i = 0; i < s1.length(); i++) {

            char current = s2.charAt(i);

            if(!map.containsKey(current) || map.get(current) == 0) {
                return false;
            } else {
                map.put(current, map.get(current) - 1);
            }
        }

        return true;
    }

}
