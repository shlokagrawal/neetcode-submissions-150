class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        int sum = 0;
        while(start < end){
            sum = numbers[start] + numbers[end];
            if(sum == target){
                return new int[]{++start, ++end};
            }
            if(sum > target){
                end--;
            }
            if(sum < target){
                start++;
            }
        }
        return new int[]{0,0};
    }
}
