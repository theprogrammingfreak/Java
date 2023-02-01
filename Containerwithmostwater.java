public class Solution
{
    public int maxArea(int[] height)
    {
        int right=height.length-1;
        int left=0;
        int max=0;
        while(left < right)
        {
            int w=right-left;
            int h=Math.min(height[right],height[left]);
            int area=h * w;
            max=Math.max(max,area);
            if(height[left]>height[right]) right--;
            else if(height[right]>height[left]) left++;
            else
            {
                left++;
                right--;
            }
        }
        return max;
    }
}
