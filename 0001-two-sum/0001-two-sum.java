class Solution {
    public int[] twoSum(int[] nums, int target) {
        int reqArr[]=new int[2];
        int  i=0;
        int j=0;
        for (i=0;i<nums.length-1;i++){
            for (j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                reqArr[0]=i;
                reqArr[1]=j;
            }
        }
    }
    return reqArr;
    }
}