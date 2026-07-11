class Solution {
    public String reverseVowels(String s) {
        String v = "aeiouAEIOU";
        int i = 0,j=s.length()-1;
        char[] a = s.toCharArray();
        while(i<j){
            if(v.indexOf(a[i])==-1){
                i++;
            }
            if(v.indexOf(a[j])==-1){
                j--;
            }
            if(v.indexOf(a[i])!=-1&&v.indexOf(a[j])!=-1){
                char temp = a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        return new String(a);
    }
}