class Solution {
    public String reverseByType(String s) {
        StringBuilder tempC = new StringBuilder("");
        StringBuilder tempS = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='a'&&c<='z'){
                tempC.append(c);
            }else{
                tempS.append(c);
            }
        }
        //System.out.println(tempC);
        //System.out.println(tempS);
        tempC.reverse();
        tempS.reverse();
        //System.out.println(tempC);
        //System.out.println(tempS);
        int k = 0;
        int l=0;
        StringBuilder res = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='a'&&c<='z'){
                res.setCharAt(i,tempC.charAt(k++));
            }else{
                res.setCharAt(i,tempS.charAt(l++));
            }
        }
        return res.toString();

        
    }
}