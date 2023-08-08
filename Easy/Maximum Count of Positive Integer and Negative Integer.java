//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
class Solution {
    public int maximumCount(int[] nums) {
        int pos=0,neg=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                continue;
            }
            if(nums[i]>0){
                pos++;
            }
            else{
                neg++;
            }
        }
        return (pos>neg)?pos:neg;
    }
}