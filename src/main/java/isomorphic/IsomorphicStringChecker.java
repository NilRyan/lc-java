package isomorphic;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStringChecker {
    public boolean isIsomorphic(String s1, String s2) {
        /*
            TODO:
            1. Create a hashmap to keep track of mappings
            2. Loop through each string and determine if char at same index can be mapped
         */
        if (s1.length() > 10) {
            throw new RuntimeException("Exceed");
        }
        Map<Character, Character> mappings = new HashMap<>();
        // foo and bar
        for (int i = 0; i < s1.length(); i++) {
            Character c = mappings.get(s2.charAt(i));
            if (c != null) {
                if (!c.equals(s1.charAt(i)))  {
                    return false;
                }
            } else {
                if (mappings.containsValue(s1.charAt(i))) return false;
                mappings.put(s2.charAt(i), s1.charAt(i));
            }

        }
        return true;
    }
}
