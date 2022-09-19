class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int[] arr = new int[101];
        for(int x: heights) arr[x]++;
        int currHeight = 0;
        for(int i=0;i<heights.length;i++){
            while( arr[currHeight] == 0) currHeight++;
            if(currHeight != heights[i]) count++;
            arr[currHeight]--;
        }
        return count;
    }
}
