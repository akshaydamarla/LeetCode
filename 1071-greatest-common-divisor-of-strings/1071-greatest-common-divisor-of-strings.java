class Solution {
    static int gcd(int n,int m){
        if(m==0){
            return n;
        }
        return gcd(m,n%m);
    }
    public String gcdOfStrings(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int len = gcd(n,m);
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        return str1.substring(0,len);
    }
}