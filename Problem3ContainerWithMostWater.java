// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {
        
        //TC O(n) SC O(1) Two pointer approach
        int max=0;
        int low=0, high=height.length-1;
        while(low<high){
            max=Math.max(max, Math.min(height[low], height[high])*(high-low)); //maximum of max and new area
            if(height[low]<=height[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return max;   
        
        //Brute force:TC O(n^2) exceeds time, SC O(n)
        // if(height==null || height.length==0){
        //     return 0;
        // }
        // int max=0;
        // for(int i=0; i<height.length-1; i++){
        //     for(int j=i+1; j<height.length; j++){
        //         max=Math.max(max, (Math.min(height[i],height[j]))*(j-i));
        //     }
        // }
        // return max;
    }
}