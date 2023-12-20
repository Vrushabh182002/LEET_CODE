class Solution {
    public int buyChoco(int[] a, int tar) {
        int ans=Integer.MAX_VALUE;
        for(int i = 0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i!=j){
                    int sum=a[i]+a[j];
                    ans=Math.min(ans,sum);
                }
            }
        }
        int res=tar-ans;
        if(res>=0){
            return res;
        }
        else{
            return tar;
        }
    }
}
