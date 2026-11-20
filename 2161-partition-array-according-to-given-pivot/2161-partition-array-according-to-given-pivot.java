class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] lefA = new int[n];
        int[] righA = new int[n];
        int l=0,r=0;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                lefA[l++]=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                lefA[l+(r++)]=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                lefA[l+(r++)]=nums[i];
            }
        }
        return lefA;
    }
}