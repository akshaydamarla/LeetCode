class Solution {
    public String mergeCharacters(String s, int k) {
        char[] let = s.toCharArray();
        StringBuilder sb = new StringBuilder(s);
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<sb.length();i++){
            if(map.containsKey(sb.charAt(i))){
                if(i-map.get(sb.charAt(i))<=k){
                    sb.deleteCharAt(i);
                    i--;
                }else{
                    map.put(sb.charAt(i),i);
                }
            }else{
                map.put(sb.charAt(i),i);
            }
        }
        return sb.toString();
        
    }
}