package Hard;
class Solution {
    public int firstMissingPositive(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            while (a[i] > 0 && a[i] <= n && a[i] != a[a[i] - 1]) {
                int temp = a[i];
                a[i] = a[a[i] - 1];
                a[temp - 1] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }
}
