class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] st = startTime.split(":");
        String[] ed = endTime.split(":");
        int sth = Integer.parseInt(st[0]);
        int stm = Integer.parseInt(st[1]);
        int sts = Integer.parseInt(st[2]);
        int edh = Integer.parseInt(ed[0]);
        int edm = Integer.parseInt(ed[1]);
        int eds = Integer.parseInt(ed[2]);
        int result = 0;
        result += (edh - sth)*60*60;
        result += (edm - stm) * 60;
        result += (eds - sts);
        return result;
        
    }
}