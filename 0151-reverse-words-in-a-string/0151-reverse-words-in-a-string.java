class Solution {
    public String reverseWords(String s) {
        String[] a = s.trim().split("\\s+");
        String res = "";
        for(int i=a.length-1;i>=0;i--){
            res+=a[i];
            if(i!=0){
                res+=" ";
            }

        }
        return res;
        
    }
}