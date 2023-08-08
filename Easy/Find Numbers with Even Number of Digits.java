//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for (int  i : nums) {
            if(even(i)){
                count++;
            }
        }
        return count;
    }
        boolean even(int num){
        int ans=digits(num);
        return ans%2==0;
        }
        int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
}