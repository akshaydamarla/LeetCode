class Solution {
    public int maxRotateFunction(int[] nums) {
        long max = Integer.MIN_VALUE;
        long sum = 0;
        for(int j=0;j<nums.length;j++){
            sum+=(nums[j]);
        }
        long presum = 0;
        for(int j=0;j<nums.length;j++){
            presum+=(j*nums[j]);
        }
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,presum);
            presum = presum + sum - (nums.length*(nums[nums.length-i-1]));
        }
        return (int)max;
        
    }
}