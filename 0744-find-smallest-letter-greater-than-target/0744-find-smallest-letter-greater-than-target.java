class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length;
        int left = 0,right=n-1;
        char res = letters[0];
        while(left<=right){
            int mid = left + (right-left)/2;
            if((letters[mid]-'a')==(target-'a')){
                if(mid+1==n){
                    return letters[0];
                }else if(letters[mid]==letters[mid+1]){
                    while(mid<n-1&&letters[mid]==letters[mid+1]){
                        mid++;
                    }
                    if(mid==n-1){
                        return letters[0];
                    }
                }
                return letters[mid+1];
            }else if((letters[mid]-'a')>(target-'a')){
                res=letters[mid];
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return res;
        
    }
}