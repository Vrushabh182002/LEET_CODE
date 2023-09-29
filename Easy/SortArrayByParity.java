//https://leetcode.com/problems/sort-array-by-parity/
class Solution {
    public int[] sortArrayByParity(int[] a) {
        int i=0,j=a.length-1;
        while(i<j){
            if(i<j&&a[i]%2==0){
                i++;
            }
            else if(i<j&&a[j]%2==1){
                j--;
            }
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
        return a;
    }
}