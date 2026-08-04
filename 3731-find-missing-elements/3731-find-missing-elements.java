class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        int k = nums[0];
        for(int i=0;i<nums.length;){
            if(k==nums[i]){
                i++;
                k++;
            }else{
                result.add(k);
                k++;
            }
        }
        return result;
        
    }
}