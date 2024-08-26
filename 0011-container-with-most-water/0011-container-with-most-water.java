import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max1=0;
        while(i<j){
            max1=Math.max(max1,((j-i)*Math.min(height[i],height[j])));
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max1;
    }
}