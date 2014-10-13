public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max=0;
        int start=0,end=height.length-1;
        while(start<end){
            int size=(end-start)*Math.min(height[end],height[start]);
            max=Math.max(max,size);
            if(height[start]<=height[end]){
                start++;
            }else{
                end--;
            }
        }
        return max;
    }
}
