class Solution {
    public int largestAltitude(int[] gain) {
        int[] pre = new int[gain.length+1];
        pre[0]=0;
        int max = 0;
        for(int i=0;i<gain.length;i++){
            pre[i+1]=pre[i]+gain[i];
        }
        for(int i=0;i<gain.length+1;i++){
            //System.out.print(pre[i]+" ");
            max = Math.max(pre[i],max);
        }
        return max;

        
    }
}