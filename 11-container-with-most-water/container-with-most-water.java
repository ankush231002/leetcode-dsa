class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0;
        int left = 0;
        int right = height.length-1;

        while(left<right){
            int area;
            int width = right - left;
            int heigth = Math.min(height[left],height[right]);
            area = heigth * width;
            maxarea = Math.max(area,maxarea);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
}