class Solution {
    public int[] countBits(int n) {
        if(n == 0) return new int[]{};
        if(n == 1) return new int[]{0};
        int[] arr = new int[n+1];
        arr[0] = 0;  
        arr[1] = 1;
        for(int i=2; i < n+1;i++){
            /*
                If a no. is even, it will contain the same no. of set bits as its half( Since multiplying an even no. by 2 adds a 0 at the end in it's binary representation, so no set bit is added).
                If the no. is odd, it will contain 1 more set bit from it's prev no( Since an odd no contains 1 at the end of string & it's prev no. contains a 0 at LSB bcz it was even)
            
            */
            arr[i] = i%2 == 0 ? arr[i/2]: arr[i-1]+1;
        }
        return arr;
    }
}
