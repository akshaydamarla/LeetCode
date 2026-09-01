class Solution {
    public boolean doesAliceWin(String s) {
        String vowel = "aeiou";
        for(int i=0;i<s.length();i++){
            if(vowel.indexOf(s.charAt(i))!=-1){
                return true;
            }
        }
        return false;
    }
}