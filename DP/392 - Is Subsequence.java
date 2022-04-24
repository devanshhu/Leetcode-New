class Solution {
    public boolean isSubsequence(String s, String t) {
      if(s.length() > t.length())
            return false;
        char sarr[] = new String(s).toCharArray();
        char tarr[] = new String(t).toCharArray();
        int i=0,j=0;
        while(i < sarr.length && j < tarr.length){
            if(sarr[i] == tarr[j])
                i++;
            j++;
        }
        
        return i == sarr.length;
          
    }
}


