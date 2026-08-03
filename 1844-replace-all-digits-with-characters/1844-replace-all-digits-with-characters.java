class Solution {
    public String replaceDigits(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                res+=s.charAt(i);
            }else{
                char c = s.charAt(i-1);
                int n = s.charAt(i)-'0';
                while(n>0){
                    c++;
                    n--;
                }
                res+=c;
            }
        }
        return res;
        
    }
}