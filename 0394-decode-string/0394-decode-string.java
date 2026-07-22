class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<Character> charStack = new Stack<>();
        String temp = "";
        String result = "";
        for(int i=0;i<s.length();i++){
            int cnt = 0;
            if(Character.isDigit(s.charAt(i))){
                while(Character.isDigit(s.charAt(i))){
                    cnt = cnt * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                numStack.push(cnt);
            }else if(s.charAt(i)==']'){
                temp="";
                cnt = numStack.pop();
                while(charStack.peek()!='['){
                    temp=charStack.pop()+temp;
                }
                charStack.pop();
                String rotated ="";
                for(int j=0;j<cnt;j++){
                    rotated+=temp;
                }
                for(int j=0;j<rotated.length();j++){
                    charStack.push(rotated.charAt(j));
                }

            }else{
                charStack.push(s.charAt(i));
            }
        }
        while(!charStack.isEmpty()){
            result=charStack.pop()+result;
        }
        return result;
        
    }
}