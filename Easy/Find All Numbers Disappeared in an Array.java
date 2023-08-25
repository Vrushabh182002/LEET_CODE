//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] a) {
        int i=0;
        while(i<a.length){
            int pos=a[i]-1;
            if(a[i]!=a[pos]){
                int t=a[i];
                a[i]=a[pos];
                a[pos]=t;
            }
            else{
                i++;
            }
        }
        List<Integer> ans= new ArrayList<>();
        for (int j = 0; j < a.length; j++) {
            if(a[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
}