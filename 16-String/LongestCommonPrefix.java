import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs); // Sort lexicographically
        
        String st1 = strs[0]; // First string after sorting
        String st2 = strs[strs.length - 1]; // Last string after sorting
        
        for (int i = 0; i < Math.min(st1.length(), st2.length()); i++) {
            if (st1.charAt(i) != st2.charAt(i)) {
                return ans.toString(); // Stop when characters don't match
            }
            ans.append(st1.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String[] args) {

        String[] words = {"flower", "flow", "flight"};
        String prefix = longestCommonPrefix(words);
        
        System.out.println("Longest Common Prefix: " + prefix);
    }
}
