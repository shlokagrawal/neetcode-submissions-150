class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character, Integer> s1 = new HashMap<>();
        Map<Character, Integer> t1 = new HashMap<>();
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        for(int i=0;i<sArray.length;i++){
            s1.put(sArray[i], s1.getOrDefault(sArray[i],1)+1);
            t1.put(tArray[i], t1.getOrDefault(tArray[i],1)+1);
        }
        return t1.equals(s1)?true:false;
    }
}
