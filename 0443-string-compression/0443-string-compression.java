class Solution {
    public int compress(char[] chars) {
        //HashMap<Character,Integer> map = new HashMap<>();
        int cnt = 1;
        char c = chars[0];
        String res = "";
        for(int i=1;i<chars.length;i++){
            if(c==chars[i]){
                cnt++;
            }else{
                res+=c;
                if(cnt!=1){
                res+=cnt;
                }
                cnt=1;
                c=chars[i];
            }
            
        }
        res+=c;
        if(cnt!=1){
            res+=cnt;
        }

        for(int i=0;i<res.length();i++){
            chars[i]=res.charAt(i);
        }
        return res.length();
    }
}