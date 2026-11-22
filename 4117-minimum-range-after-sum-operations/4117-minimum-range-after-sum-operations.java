class Solution {
    public int minRange(int a, int b, int c) {
        int minRange = Math.max(a,Math.max(b,c))-Math.min(a,Math.min(b,c));
        int range = 0;
        do{
            if(a+b<c){
                c=a+b;
            }else if(b+c<a){
                a=b+c;
            }else{
                b=a+c;
            }
            range = Math.max(a,Math.max(b,c))-Math.min(a,Math.min(b,c));
            minRange = Math.min(range,minRange);
        }while(range<minRange);

        return minRange;
    }
}