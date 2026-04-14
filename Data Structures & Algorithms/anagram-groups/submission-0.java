class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0) return Collections.emptyList();

        String a = strs[0];
        char[] aArray = a.toCharArray();
        List<Map<Character, Integer>> hashMapList = new ArrayList<>(); // will store hashmaps 
        List<List<String>> stringList = new ArrayList<>(); // it will contain anagram pairs
        Map<Character, Integer> hashMap0 = new HashMap<>();
        for(int i=0;i<aArray.length;i++){
            hashMap0.put(aArray[i], hashMap0.getOrDefault(aArray[i], 0)+1);
        }

        hashMapList.add(hashMap0);
        List<String> list0 = new ArrayList<>();
        list0.add(a);
        stringList.add(list0);

        for(int i=1;i<strs.length;i++){
            String word = strs[i];
            char[] wordArray = word.toCharArray();
            Map<Character, Integer> hashMapWord = new HashMap<>();
            for(int j=0;j<wordArray.length;j++){
                hashMapWord.put(wordArray[j], hashMapWord.getOrDefault(wordArray[j], 0)+1);
            }
            int flag = 0;
            for(int k = 0;k<hashMapList.size();k++){
                if(hashMapWord.equals(hashMapList.get(k))){
                    stringList.get(k).add(word);
                    flag = 1;
                }
            }
            if(flag==0){
                hashMapList.add(hashMapWord);
                List<String> newList = new ArrayList<>();
                newList.add(word);
                stringList.add(newList);
            }
            
        }
        return stringList;
    }
}
