class Solution {
    static String rev (String s){
        String res = "";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return res;
    }
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        String result = "";
        for(int i=0;i<str.length;i++){
            result+=rev(str[i]);
            result+=" ";
        }
        result = result.trim();
        return result;
    }
}