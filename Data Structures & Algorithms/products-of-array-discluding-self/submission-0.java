class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixSum = new int[nums.length];
        int[] suffixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefixSum[i] = nums[i] * prefixSum[i-1];
        }
        suffixSum[nums.length-1] = nums[nums.length-1];
        for(int i=(nums.length-1)-1;i>=0;i--){
            suffixSum[i] = nums[i] * suffixSum[i+1];
        }
        int[] ans = new int[nums.length];
        ans[0] = suffixSum[1];
        ans[nums.length-1] = prefixSum[nums.length-2];
        for(int i=1;i<ans.length-1;i++){
            ans[i] = prefixSum[i-1] * suffixSum[i+1];
        }
        return ans;
    }
}  
