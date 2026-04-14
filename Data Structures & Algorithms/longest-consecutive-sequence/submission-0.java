class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){return 0;}
        Set<Integer> hashSet = new HashSet<>();
        int longestConSeq = 0;
        int sequence = 0;
        for(int i=0;i<nums.length;i++){
            hashSet.add(nums[i]);
        }
        for(Integer number : hashSet){
            if(!hashSet.contains(number-1)){
                while(hashSet.contains(number+1)){
                    sequence++;
                    number++;
                }
            longestConSeq = Math.max(longestConSeq, sequence);
            sequence = 0;
            }
        }
        return longestConSeq+1;
    }
}
