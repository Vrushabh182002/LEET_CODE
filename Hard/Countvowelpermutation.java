//https://leetcode.com/problems/count-vowels-permutation/description/
package Hard;
class Solution {
    public int countVowelPermutation(int n) {
        final int mod=1000000007;
        long a=1,e=1,i=1,o=1,u=1;
        for(int x=1;x<n;x++){
            long af=e;
            long ef=(a+i)%mod;
            long i_f=(a+e+o+u)%mod;
            long of=(i+u)%mod;
            long uf=a;
            a=af;
            e=ef;
            i=i_f;
            o=of;
            u=uf;
        }
        return (int)((a+e+i+o+u)%mod);
    }
}