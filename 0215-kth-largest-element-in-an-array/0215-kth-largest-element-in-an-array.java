class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> q = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            q.offer(nums[i]);
        }
        int t = nums.length-k;
        while(t>0){
            q.poll();
            t--;
        }
        return q.peek();
        
    }
}