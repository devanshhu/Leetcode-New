class SegmentTree {

    int[] arr;
    int[] tree;
    public SegmentTree(int[] nums) {
        arr = nums;
        tree = new int[nums.length*4];
        build(0,0,nums.length -1 );
    }
    
    public void build(int index, int low, int high){
        if(low == high){
            tree[index] = arr[low];
            return;
        }
        
        int mid = (low+high)/2;
        build(2*index+1,low, mid);
        build(2*index+2, mid+1, high);
        tree[index] = tree[2*index+1] + tree[2*index+2];
    }
    
    public void update(int index, int val) {
        updateST(0,0,arr.length-1,index,val);
        arr[index] = val;
    }
    
    public void updateST(int index, int low, int high, int i, int val){
        if(index == i){
            tree[index] = val; return;
        }
        int mid = (low+high)/2;
        if(i >= low && i <= mid ) updateST(2*index+1,low, mid,i,val);
        else
            updateST(2*index+2,mid+1,high,i,val);
        tree[index] = tree[2*index+1]+ tree[2*index+2];
    }
    
    public int sumRange(int left, int right) {
        return getSum(0,0,arr.length-1, left, right);
    }
    
    public int getSum(int index, int start, int end, int ql , int qr){
        if( start > qr || end < ql )
            return 0;
       if(start >= ql && end <= qr) {
           return tree[index];
        }
        int mid = (start+end)/2;
        return getSum(2*index+1, start, mid, ql, qr) + getSum(2*index+2,mid+1, end, ql, qr);
        
    }
    
    
    
}
