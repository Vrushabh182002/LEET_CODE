//https://leetcode.com/problems/find-the-duplicate-number/description/
class Solution {
    public int findDuplicate(int[] a) {
        int i=0;
        while(i<a.length){
            int pos = a[i]-1;
            if(a[i]!=i+1){
                if(a[i]!=a[pos]){
                int t = a[i];
                a[i] = a[pos];
                a[pos] = t;
                }
                else{
                    return a[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
}