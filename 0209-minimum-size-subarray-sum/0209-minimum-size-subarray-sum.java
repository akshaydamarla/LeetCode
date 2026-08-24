class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int cnt = 0;
        
        int i=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum>=target){
                min = Math.min(min, j-i+1);
                sum-=nums[i];
                i++;
            }
        }
        //min = Math.min(cnt,min);
        return min==Integer.MAX_VALUE?0:min;

        
    }
}