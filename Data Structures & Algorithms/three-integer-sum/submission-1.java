class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1]) continue;
            int start = i+1;
            int end = nums.length - 1;
            while(start<end){
                int sum = nums[i]+nums[start]+nums[end];
                if(sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    answer.add(list);
                    start++;
                    end--;
                    while (start < end && nums[start] == nums[start - 1]) {
                        start++;
                    }
                }
                if(sum > 0){
                    end--;
                }
                if(sum < 0){
                    start++;
                }
            }
        }
        return answer;
    }
}
