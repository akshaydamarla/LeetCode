class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        if(s1.length()>s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            cnt1[s1.charAt(i)-'a']++;
        }
        for(int j=0;j<s1.length();j++){
                cnt2[s2.charAt(j)-'a']++;
            }
            if(Arrays.equals(cnt1,cnt2)){
                return true;
            }
            cnt2[s2.charAt(0)-'a']--;
            int left = 1;
        for(int i=s1.length();i<s2.length();i++){
            cnt2[s2.charAt(i)-'a']++;
            if(Arrays.equals(cnt1,cnt2)){
                return true;
            }
            cnt2[s2.charAt(left)-'a']--;
            left++;
        }
        return false;
    }
}