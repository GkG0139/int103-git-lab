import java.util.HashSet;
import java.util.Set;

class Solution {

  public int lengthOfLongestSubstring(String s) {
    Set<Character> set = new HashSet<Character>();
    int max = 0, leftPointer = 0, rightPointer = 0;

    while (rightPointer < s.length()) {
      if (!set.contains(s.charAt(rightPointer))) {
        set.add(s.charAt(rightPointer++));
        max = Math.max(max, set.size());
      } else {
        set.remove(s.charAt(leftPointer++));
      }
    }

    return max;
  }
}
