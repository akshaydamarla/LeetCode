class Solution {
    public boolean isPalindrome(String s) {
        String res ="";
        for(int i=0;i<s.length();i++){
            char c = Character.toLowerCase(s.charAt(i));
            if(c>='a'&&c<='z'||c>='0'&&c<='9'){
                res+=c;
            }
        }
        int i=0, j = res.length()-1;
        while(i<=j){
            char c1 = Character.toLowerCase(res.charAt(i++));
            char c2 = Character.toLowerCase(res.charAt(j--));
            if(c1!=c2){
                return false;
            }
        }
        return true;
        
    }
}