//https://leetcode.com/problems/search-a-2d-matrix/
package Medium;
class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}