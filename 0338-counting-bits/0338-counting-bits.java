class Solution {
    public int[] countBits(int n) {
        int[] a = new int[n+1];
        for(int i=0;i<=n;i++){
            int temp = i;
            int cnt = 0;
            while(temp>0){
                cnt++;
                temp=temp&(temp-1);
            }
            a[i]=cnt;
        }
        return a;
        
    }
}