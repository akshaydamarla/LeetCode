class Solution {
    public int maxVowels(String s, int k) {
        String vo = "aeiou";
        int cnt = 0;

        for(int i=0;i<k;i++){
            if(vo.indexOf(s.charAt(i))!=-1){
                cnt++;
            }
        }
        int maxCnt=cnt;
        for(int i=k;i<s.length();i++){
            if(vo.indexOf(s.charAt(i-k))!=-1){
                cnt--;
            }
            if(vo.indexOf(s.charAt(i))!=-1){
                cnt++;
            }
            maxCnt = Math.max(cnt,maxCnt);
        }
        return maxCnt;
        
    }
}