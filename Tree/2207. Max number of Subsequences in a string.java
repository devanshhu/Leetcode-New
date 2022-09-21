// We can either add pattern[0] or pattern[1] to the string.
// We need to find max no of SUBSEQUENCE of pattern as a string So if we either
//      add pattern[0] to the start, it will contribute maximum to our count of subsequence
//      add pattern[1] to the end, it will contribute maximum our count of subsequence.
//  So we run 2 condition in a single loop 1 from left to right with i & other from right to left with j
// let pattern ="ac":
//    then counting the occurence of 'c' when I move from left to right would give me subsequences till that point.
//    & counting the occurence of 'a' when I move from right to left would give me subsequence till that point.
// In the end return max of both counts.
class Solution {
        public long maximumSubsequenceCount(String text, String pattern) {
            long a=1,b=1,res1 = 0,res2 = 0,n = text.length();
            for(int i=0, j = (int)(n-1);i<n;i++,--j){
                if(pattern.charAt(1) == text.charAt(i)){
                    res1 += a;
                }
                if(text.charAt(i) == pattern.charAt(0)) a++;
                if(pattern.charAt(0) == text.charAt(j))
                    res2 += b;
                if(text.charAt(j) == pattern.charAt(1)) b++;
            }

            return Math.max(res1, res2);
        }
    }
