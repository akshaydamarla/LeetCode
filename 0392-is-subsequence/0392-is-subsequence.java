class Solution {
    public boolean isSubsequence(String s, String t) {
       int si=0,ti=0;
       if(t.length()<s.length()){
        return false;
       }
       while(si<s.length()&&ti<t.length()){
        while(ti<t.length()&&t.charAt(ti)!=s.charAt(si)){
            ti++;
        }
        if(ti==t.length()){
            return false;
        }
        ti++;
        si++;
       }
       return si==s.length();
        
    }
}