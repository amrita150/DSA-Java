package FixedSizeWindow;
import java.util.*;

public class LongestSubstringWithKUnique {

    public static int longestKSubstr(String s, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int maxAns = -1;
        int i = 0, j = 0;
        int count = 0;

        while (j < s.length()) {
            char ch = s.charAt(j);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);

            if (hm.get(ch) == 1) count++;  // First time seeing this char

            if (count < k) {
                j++;
            }
            else if (count == k) {
                maxAns = Math.max(maxAns, j - i + 1);
                j++;
            }
            else { // count > k
                while (count > k) {
                    char ch1 = s.charAt(i);
                    hm.put(ch1, hm.get(ch1) - 1);
                    if (hm.get(ch1) == 0) {
                        hm.remove(ch1);
                        count--;
                    }
                    i++;
                }
                j++;
            }
        }

        return maxAns;
    }

    public static void main(String[] args) {
        // Sample Test Cases
        String s1 = "aabacbebebe";
        int k1 = 3;
        System.out.println("Output for s1: " + longestKSubstr(s1, k1)); 

        String s2 = "aaaa";
        int k2 = 2;
        System.out.println("Output for s2: " + longestKSubstr(s2, k2));
        String s3 = "abcabcabc";
        int k3 = 3;
        System.out.println("Output for s3: " + longestKSubstr(s3, k3)); 
    }
}
