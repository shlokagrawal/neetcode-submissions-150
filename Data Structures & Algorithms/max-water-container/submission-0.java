class Solution {
    public int maxArea(int[] heights) {
          int maxArea = Integer.MIN_VALUE;
        int left = 0;
        int right = heights.length-1;
        System.out.println(right);
        while(left<right){
            int len = Math.min(heights[left], heights[right]);
            int bre = right - left;
            int area = len * bre;
            maxArea = Math.max(maxArea, area);
            if(heights[left]<heights[right]){
              left++;  
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
