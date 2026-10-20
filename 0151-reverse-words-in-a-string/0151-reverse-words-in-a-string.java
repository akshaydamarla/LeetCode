class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        int first = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(first<i){
                    st.push(s.substring(first,i));
                }
                first=i+1;
            }
        }
        if(first<s.length()){
                st.push(s.substring(first));
        }
        
        
        StringBuilder sb = new StringBuilder("");
        while(!st.isEmpty()){
            System.out.println(st.peek());
            sb.append(st.pop());
            sb.append(" ");
        }
        return sb.toString().trim();
        
    }
}