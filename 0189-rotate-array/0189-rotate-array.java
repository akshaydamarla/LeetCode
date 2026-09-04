class Solution {
    public void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int l = (i+k)%nums.length;
            res[l]=nums[i];
        }    
        for(int i=0;i<nums.length;i++){
            nums[i]=res[i];
        }
    }
}