//https://leetcode.com/problems/median-of-two-sorted-arrays/
class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int m=a.length;
        int n=b.length;
        int i=0,j=0,k=0;
        int c[]=new int[m+n];
        while(i<m&&j<n){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
            }
            else{
                c[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<m){
            c[k]=a[i];
            i++;
            k++;
        }
        while(j<n){
            c[k]=b[j];
            j++;
            k++;
        }
        Arrays.sort(c);
        int w=c.length;
        if(w%2==1){
            return (double)a[w/2];
        }
        else{
            int x=w/2;
            double y=c[x];
            double z=c[x-1];
            return (y+z)/2;
        }
    }
}