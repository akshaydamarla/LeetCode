class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        int left = 0,right=0;
        while(right<s.length()){
            if(set.contains(s.charAt(right))){
                max = Math.max(max,right-left);
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left++));
                }
            }
            set.add(s.charAt(right));
            right++;
        }
        max = Math.max(max,right-left);
        return max;
    }
}