package subsequence;

public class SubsequenceChecker {


    public static boolean IsSubsequence(String s, String t) {

        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = index; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    index = j;
                    break;
                }
                if (j == t.length() - 1 && s.charAt(i) != t.charAt(j)) return false;
            }
        }
        return true;
    }
}
