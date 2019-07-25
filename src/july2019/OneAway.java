package july2019;

public class OneAway {

    public static void main(String[] args) {

        System.out.println(oneAway("pale", "ple"));
        System.out.println(oneAway("pales", "pale"));
        System.out.println(oneAway("pale", "bale"));
        System.out.println(oneAway("pale", "bae"));

    }

    static boolean oneAway(String s1, String s2) {

        if (s1 == null || s2 == null) {
            return false;
        }

        int diff = s1.length() - s2.length();

        if (diff < -1 || diff > 1 || s1.equals(s2)) {
            return false;
        }

        int i = 0, j = 0;
        boolean diffFound = false;

        while (i < s1.length() && j < s2.length()) {

            char current1 = s1.charAt(i);
            char current2 = s2.charAt(j);
            if (current1 != current2) {
                if(diffFound) {
                    return false;
                }

                diffFound = true;
                if (j < s2.length() - 1 && current1 == s2.charAt(j + 1)) {
                    j++;
                } else if (i < s1.length() - 1 && current2 == s1.charAt(i + 1)) {
                    i++;
                } else if (i < s1.length() -1 && j < s2.length() - 1 && s1.charAt(i + 1) == s2.charAt(j + 1)) {
                    j++;
                    i++;
                } else {
                    return false;
                }
            }

            i++;
            j++;
        }
        return true;
    }
}
