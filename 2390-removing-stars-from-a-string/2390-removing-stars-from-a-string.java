class Solution {
    public String removeStars(String s) {
        //Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder("");
        int cnt= 0;
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            if(c=='*'){
                cnt++;
            }else if(cnt>0){
                cnt--;
            }else{
                res.append(c);
            }
        }
        return (res.reverse()).toString();
        
    }
}