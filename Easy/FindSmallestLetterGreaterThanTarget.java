//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
class Solution {
    public char nextGreatestLetter(char[] a, char target) {
        int s=0,e=a.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(target>=a[m]){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return a[s%a.length];
    }
}