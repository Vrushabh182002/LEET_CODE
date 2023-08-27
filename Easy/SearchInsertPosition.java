//https://leetcode.com/problems/search-insert-position/description/
class Solution {
    public int searchInsert(int[] a, int target) {
        int s=0,e=a.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(a.length==0){
                return -1;
            }
            if(a[mid]==target){
                return mid;
            }
            if(target<a[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return s;
    }
}