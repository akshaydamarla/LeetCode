class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int gmax = nums[0];
        int min = nums[0];
        int prevMax = nums[0];
        int prevMin = nums[0];
        for(int i=1;i<nums.length;i++){
            max = Math.max(Math.max(nums[i],nums[i]*prevMax),prevMin*nums[i]);
            min = Math.min(Math.min(nums[i],nums[i]*prevMin),prevMax*nums[i]);
            prevMax = max;
            prevMin = min;
            gmax = Math.max(gmax,Math.max(max,min));
        }
        return gmax;
        
    }
}