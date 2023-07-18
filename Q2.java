package problems;

import java.util.HashSet;

public class Q2 {

	public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        int right = 0; 
        HashSet<Character> characters = new HashSet<>();

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            if (!characters.contains(currentChar)) {
              
                characters.add(currentChar);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                
                characters.remove(s.charAt(left));
                left++; 
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println("Output: " + result); // Output: 3
    }

}
