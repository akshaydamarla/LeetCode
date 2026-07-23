class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            while(!dq.isEmpty()&&dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty()&&nums[dq.peekLast()]<=nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i>=k-1){
                res.add(nums[dq.peekFirst()]);
            }
        }
        int[] ans = new int[nums.length-k+1];
        for(int i=0;i<nums.length-k+1;i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}