//https://leetcode.com/problems/set-mismatch/description/
class Solution {
    public int[] findErrorNums(int[] a) {
        int i=0;
        while(i<a.length){
            int pos=a[i]-1;
            if(a[i]!=a[pos]){
                int t = a[i];
                a[i] = a[pos];
                a[pos] = t;
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < a.length; j++) {
            if(a[j]!=j+1){
                return new int[]{a[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }
}