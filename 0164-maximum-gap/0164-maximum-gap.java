class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        int maxGap = Integer.MIN_VALUE;
        int gap = Integer.MIN_VALUE;
        Queue<Integer> queue = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            queue.offer(nums[i]);
        }
        while(queue.size()>1){
            int n1 = queue.poll();
            int n2 = queue.peek();
            gap = Math.abs(n1-n2);
            maxGap = Math.max(gap,maxGap);
        }
        maxGap = Math.max(gap,maxGap);
        return maxGap;
        
    }
}