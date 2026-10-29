class Solution {
    public int maxProduct(int[] nums) {
        int prod = 1;
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            prod=1;
            for(int j=i;j<nums.length;j++){
                prod *=nums[j];
                max=Math.max(prod,max);
            }
        }
        max=Math.max(prod,max);

        return max;
        
    }
}