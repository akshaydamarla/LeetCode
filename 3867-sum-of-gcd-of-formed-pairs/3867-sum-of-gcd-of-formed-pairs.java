class Solution {
    static long gcd(long a,long b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        long[] preMax = new long[n];
        preMax[0]=nums[0];
        for(int i=1;i<n;i++){
            preMax[i]=Math.max(preMax[i-1],nums[i]);
        }
        //long[] prefixGcd = new long[n];
        for(int i=0;i<n;i++){
            preMax[i]=gcd(nums[i],preMax[i]);
        }
        Arrays.sort(preMax);
        int i = 0,j=n-1;
        long res = 0;
        while(i<j){
            res+=gcd(preMax[i++],preMax[j--]);
        }
        return res;
        
    }
}