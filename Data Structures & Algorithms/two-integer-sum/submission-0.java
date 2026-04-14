class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hashMap.put(nums[i],i);
        }
        int[] answer = new int[2];
        for(int i=0;i<nums.length;i++){
            int difference = target - nums[i];
            if(hashMap.containsKey(difference)){
                answer[0] = i;
                answer[1] = hashMap.get(difference);
                if(answer[0]!=answer[1]) break;
            }
        }
        return answer;
    }
}
