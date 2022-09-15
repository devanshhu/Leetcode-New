class Solution {
    public boolean judgeSquareSum(int c) {
        // taking l as 0 will handle the case for c = 0 && c being a perfect square i.e.
        // when c is a perfect square the case would be handled with l=0 & r = sqrt(c) ;
        long l = 0, r = (long)(Math.sqrt(c));
        while(l <= r){
            
            long mid = (l*l+ r*r);
            if(mid == (long)c) return true;
            if(mid < c) l+=1;
            else
                r -=1;
        }
        return false;
    }
}
