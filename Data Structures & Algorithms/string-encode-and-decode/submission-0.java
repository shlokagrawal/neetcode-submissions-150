class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedMessage = new StringBuilder();
        for(String s: strs){
            encodedMessage.append(s.length()).append("#").append(s);
        }
        return encodedMessage.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int separator = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, separator));
            i = separator + 1;
            result.add(str.substring(i, i + length));
            i += length;
        }
        return result;
    }
}