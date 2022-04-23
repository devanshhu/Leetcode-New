class Solution {
    public int fib(int n) {
        if(n == 0 ) return 0;
        int f=0, s=1;
        while(n-- > 1){
            int tmp = f;
            f = s;
            s = tmp + s;
        }
        return s;
    }
}