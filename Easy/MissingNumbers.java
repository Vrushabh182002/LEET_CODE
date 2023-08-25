//https://leetcode.com/problems/missing-number/
public class MissingNumbers{
    public static void main(String[] args) {
        int a[]={4,2,1,0};
        System.out.println(sort(a));
    }
    static int sort(int a[]){
        int i=0;
        while(i<a.length){
            int pos=a[i];
            if(a[i]<a.length && a[i]!=a[pos]){
                int t=a[i];
                a[i]=a[pos];
                a[pos]=t;
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < a.length; j++) {
            if(a[j]!=j){
                return j;
            }
        }
        return a.length;
    }
}