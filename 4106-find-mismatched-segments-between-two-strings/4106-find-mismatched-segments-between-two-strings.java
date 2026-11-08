class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> res = new ArrayList<>();
        List<String> segments = new ArrayList<>();
        StringBuilder st1 = new StringBuilder("");
        StringBuilder st2 = new StringBuilder("");
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                st1.append(s1.charAt(i));
                st2.append(s2.charAt(i));
            }else if(s1.charAt(i)==s2.charAt(i)&&(!(st1.toString().equals("")))){
                segments.add(st1.toString());
                segments.add(st2.toString());
                st1 = new StringBuilder("");
                st2 = new StringBuilder("");
                res.add(segments);
                segments=new ArrayList<>();
            }else{
                continue;
            }
        }
        if(!(st1.toString().equals(""))){
            segments.add(st1.toString());
            segments.add(st2.toString());
            res.add(segments);
        }
        return res;
        
    }
}