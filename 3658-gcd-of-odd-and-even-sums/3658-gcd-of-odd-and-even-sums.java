class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = 0;
        int even = 0;
        int k = n;
        int i=1;
        while(k>0){
            odd+=i;
            i+=2;
            k--;
        }
        k=n;
        i=2;
        while(k>0){
            even+=i;
            i+=2;
            k--;

        }
        for(i = Math.min(odd,even);i>=0;i--){
            if(odd%i==0&&even%i==0){
                return i;
            }
        }
        return i;
    }
}