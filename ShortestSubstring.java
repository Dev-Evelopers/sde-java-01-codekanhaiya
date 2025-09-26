import java.util.HashSet;
import java.util.Set;

public class ShortestSubstring {

    public static int shortSub(String str) {
        Set<Character> unique = new HashSet<>();
        for (char ch : str.toCharArray()) {
            unique.add(ch);
        }

        int minLen = str.length();

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                set.add(str.charAt(j));
                if (set.size() == unique.size()) {
                    minLen = Math.min(minLen, j - i + 1);
                    break;
                }
            }
            set.clear();
        }

        return minLen;
    }

    public static void main(String[] args) {
        String str1 = "dabbcabcd";
        String str2 = "asdfkjeghfalawefhaef";
        System.out.println(shortSub(str1));
        System.out.println(shortSub(str2));
    }
}
