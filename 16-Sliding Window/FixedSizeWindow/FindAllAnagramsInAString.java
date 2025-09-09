import java.util.*;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> lt = new ArrayList<>();
        int i = 0, j = 0;
        int k = p.length();

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int z = 0; z < p.length(); z++) {
            hm.put(p.charAt(z), hm.getOrDefault(p.charAt(z), 0) + 1);
        }

        int occ = hm.size();

        while (j < s.length()) {
            char ch = s.charAt(j);
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) - 1);
                if (hm.get(ch) == 0) {
                    occ--;
                }
            }

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (occ == 0) {
                    lt.add(i);
                }
                if (hm.containsKey(s.charAt(i))) {
                    if (hm.get(s.charAt(i)) == 0) {
                        occ++;
                    }
                    hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
                }
                i++;
                j++;
            }
        }

        return lt;
    }

    public static void main(String[] args) {
        FindAllAnagramsInAString sol = new FindAllAnagramsInAString();

        String s1 = "cbaebabacd";
        String p1 = "abc";
        System.out.println("Input: s = " + s1 + ", p = " + p1);
        System.out.println("Output: " + sol.findAnagrams(s1, p1)); // Expected: [0,6]

        String s2 = "abab";
        String p2 = "ab";
        System.out.println("Input: s = " + s2 + ", p = " + p2);
        System.out.println("Output: " + sol.findAnagrams(s2, p2)); // Expected: [0,1,2]
    }
}
