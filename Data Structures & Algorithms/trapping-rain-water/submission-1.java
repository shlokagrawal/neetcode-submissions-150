class Solution {
    public int trap(int[] height) {
        int leftBuilding = 0;
        int rightBuilding = 0;
        int waterTrapped = 0;
        int block = 0;
        int n = height.length;
        for(int i=1;i<n;i++){
            if(height[i-1]>leftBuilding){
                leftBuilding = height[i-1];
            }
            int k = i+1;
            while(k<n){
                if(height[k]>rightBuilding){
                    rightBuilding = height[k];
                }
                k++;
            }
            int minBuilding = Math.min(leftBuilding,rightBuilding);
            rightBuilding = 0;
            block = minBuilding - height[i];
            if(block > 0) waterTrapped += block;
        }
        return waterTrapped;
    }
}

//Time Complexity - O(N2)
