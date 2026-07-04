/*
1. Sort the array to enable two-pointer searching and easy duplicate removal.
2. Fix one element and use two pointers (left & right) to find pairs forming sum = 0.
3. Move pointers based on sum comparison and skip duplicates to avoid repeated triplets.
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        int n = nums.length;
        int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            int left=i+1;
            int right=n-1;
            while(left<right){
            sum=nums[i]+nums[left]+nums[right];
            if(sum==0){
                    List<Integer> subl = new ArrayList<>();
                        subl.add(nums[i]);
                        subl.add(nums[left++]);
                        subl.add(nums[right--]);
                        l.add(subl);
                        while(left<right&&nums[left]==nums[left-1]) left++;
                        while(left<right&&nums[right]==nums[right+1]) right--;
                    }else if(sum<0){
                        left++;
                    }else if(sum>0){
                        right--;
                    }
            }
                    
        }
        return l;
        
    }
}