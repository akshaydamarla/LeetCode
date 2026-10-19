class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder("");
        int cnt= 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                st.push(s.charAt(i));
            }else{
                st.pop();
            }
        }
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return (res.reverse()).toString();
        
    }
}