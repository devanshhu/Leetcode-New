class Solution {
    public int tribonacci(int n) {
        int t0=0, t1=1, t2=1, i =2, sum =0 ;
        if( n == 0 ) return 0;
        if(n == 1 || n == 2) return 1;
        while(i < n){
            sum = t0+ t1+t2;
            t0 = t1;
            t1 = t2;
            t2 = sum;
            i++;
        }
        
        return t2;
    }
}