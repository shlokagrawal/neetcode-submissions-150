class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        char[] sentense = s.toCharArray();
        int start = 0;
        int end = sentense.length - 1;
        while(start<=end){
            if(sentense[start]!=sentense[end]) return false;
            start++;
            end--;
        }
        return true;
    }
}
