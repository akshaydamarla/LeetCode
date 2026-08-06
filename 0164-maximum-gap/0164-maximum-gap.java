class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        int maxGap = Integer.MIN_VALUE;
        int gap = Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            gap = Math.abs(nums[i]-nums[i+1]);
            maxGap = Math.max(gap,maxGap);
        }
        maxGap = Math.max(gap,maxGap);
        return maxGap;
        
    }
}