class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        if(word1.length()!=word2.length()){
            return false;
        }
        for(int i=0;i<word1.length();i++){
            map1.put(word1.charAt(i),map1.getOrDefault(word1.charAt(i),0)+1);
        }
        for(int i=0;i<word2.length();i++){
            map2.put(word2.charAt(i),map2.getOrDefault(word2.charAt(i),0)+1);
        }
        List<Integer> set = new ArrayList<>();
        for(char key: map1.keySet()){
            if(map2.getOrDefault(key,0)==0){
                return false;
            }
        }
        for(char key:map1.keySet()){
            set.add(map1.get(key));
        }
        for(char key:map2.keySet()){
            if(!set.contains(map2.get(key))){
                return false;
            }else{
                set.remove(map2.get(key));
            }
        }
        return true;


        
    }
}