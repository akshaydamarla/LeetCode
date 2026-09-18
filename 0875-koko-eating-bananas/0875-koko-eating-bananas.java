class Solution {
    static int countTime(int n,int[] a){
        int res = 0;
        for(int i=0;i<a.length;i++){
            res+=(a[i] + n -1)/n;
        }
        return res;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i=0;i<piles.length;i++){
            max=Math.max(piles[i],max);
        }
        int res = 0;
        int i=1,j=max;
        while(i<j){
            int mid = i + (j-i)/2;
            res = countTime(mid,piles);
            if(res<=h){
                j=mid;
            }else{
                i=mid+1;
            }
        }
        return i;

        
    }
}