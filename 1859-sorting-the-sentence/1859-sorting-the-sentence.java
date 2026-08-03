class Solution {
    public String sortSentence(String s) {
        String[] res = new String[9];
        String[] words = s.split(" ");
        for(int i=0;i<words.length;i++){
            int k = words[i].charAt(words[i].length()-1)-'0';
            res[k-1]=words[i].substring(0,words[i].length()-1);
        }
        String result = "";
        for(int i=0;i<res.length;i++){
            if(res[i]==null){
                break;
            }
            result+=res[i];
            result+=" ";
        }
        return result.strip();
        
    }
}