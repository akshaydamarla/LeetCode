class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int sum = 0;
            int left=i+1,right=nums.length-1;
            while(left<right){
                List<Integer> temp = new ArrayList<>();
                if(nums[i]+nums[left]+nums[right]==0){
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    set.add(temp);
                    left++;
                    right--;
                }else if(nums[i]+nums[left]+nums[right]>0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        for(List<Integer> key:set){
            res.add(key);
        }
        return res;
        
    }
}