class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        StringBuilder res = new StringBuilder("");
        int cnt= 0;
        while(!st.isEmpty()){
            char c = st.pop();
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