/* 1480. Running Sum of 1d Array
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

  Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1]. */



class Solution {
    public int[] runningSum(int[] nums) {
        int[] run=new int[nums.length];
        int temp=0;
        for(int i=0;i<nums.length;i++)
        {
            temp+=nums[i];
            run[i]=temp;
        }
        return run;
    }
}
