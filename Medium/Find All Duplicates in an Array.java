//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] a) {
        int i=0;
        while(i<a.length){
            int pos =a[i]-1;
            if(a[i]!=a[pos]){
                int t = a[i];
                a[i] = a[pos];
                a[pos] = t;
            }
            else{
                i++;
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int j=0;j<a.length;j++){
            if(a[j]!=j+1){
                res.add(a[j]);
            }
        }
        return res;
    }
}