class Solution {
    public int smallestNumber(int n, int t) {
        int k = n;
        int sum = 1;
        do{
            k = n;
            
        while(k>0){
            sum*=k%10;
            k/=10;
        }
        if(sum%t==0){
            return n;
        }
        sum=1;
        n++;
        }while(sum%t!=0);
        return n-1;
    }
}