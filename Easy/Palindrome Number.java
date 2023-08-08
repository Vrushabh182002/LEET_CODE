//https://leetcode.com/problems/palindrome-number/
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev=0,k=x;
        while(k!=0){
            int dig=k%10;
            rev=rev*10+dig;
            k/=10;
        }
        return (rev==x);
    }
}