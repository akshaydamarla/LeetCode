class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length()/2;
        int i=mid-1,j=mid;
        String vowel = "aeiouAEIOU";
        int lc=0,rc=0;
        while(i>=0&&j<s.length()){
            if(vowel.indexOf(s.charAt(i--))!=-1){
                lc++;
            }
            if(vowel.indexOf(s.charAt(j++))!=-1){
                rc++;
            }

        }
        return lc==rc;
        
    }
}