class Solution {
    static int countTime(double n,int[] a){
        int res = 0;
        for(int i=0;i<a.length;i++){
            res+=Math.ceil(((double)a[i])/n);
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