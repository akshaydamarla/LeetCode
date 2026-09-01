class Solution {
    public boolean doesAliceWin(String s) {
        int cnt = 0;
        String vowel = "aeiou";
        for(int i=0;i<s.length();i++){
            if(vowel.indexOf(s.charAt(i))!=-1){
                cnt++;
            }
        }
        if(cnt==0){
            return false;
        }
        return true;
    }
}