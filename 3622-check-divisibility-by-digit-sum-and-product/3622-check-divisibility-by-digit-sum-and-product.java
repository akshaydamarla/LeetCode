class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        long product = 1;
        int num = n;
        while(n>0){
            sum+=n%10;
            product*=n%10;
            n/=10;
        }
        return (num)%(sum+product)==0;
        
    }
}