class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][] arr = new int[m][n];
        Arrays.fill(arr[0],1);
        for(int i=0;i < arr.length;i++){
            arr[i][0] = 1;
        }
        for(int i=1;i< arr.length;i++){
            for(int j=1;j< arr[0].length;j++){
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }
        return arr[m-1][n-1];
    }
}