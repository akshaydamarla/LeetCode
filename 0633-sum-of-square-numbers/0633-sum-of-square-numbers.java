class Solution {
    public boolean judgeSquareSum(int c) {
        int sq = (int)Math.sqrt(c);
        int i=0,j=sq;
        while(i<=j){
            long v = (long)i*i+(long)j*j;
            if(v==c){
                return true;
            }else if(v<c){
                i++;
            }else{
                j--;
            }
        }
        return false;
        
    }
}