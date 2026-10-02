class Solution {
    static boolean isVo(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int cnt = 0;
        for(int i=0;i<k;i++){
            if(isVo(s.charAt(i))){
                cnt++;
            }
        }
        int maxCnt=cnt;
        for(int i=k;i<s.length();i++){
            if(isVo(s.charAt(i-k))){
                cnt--;
            }
            if(isVo(s.charAt(i))){
                cnt++;
            }
            maxCnt = Math.max(cnt,maxCnt);
        }
        return maxCnt;
        
    }
}