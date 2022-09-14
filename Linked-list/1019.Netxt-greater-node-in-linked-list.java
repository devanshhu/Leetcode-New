
class Solution {
    public int[] nextLargerNodes(ListNode head) {
     
        List<Integer> list = new LinkedList();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        int i = arr.length-1;
        Stack<Integer> st = new Stack();
        while(i >= 0){
            while(!st.empty() && st.peek() <= arr[i]){
                st.pop();
            }            
            if(st.empty()){
                st.push(arr[i]);
                arr[i] = 0;
            }else{
                int tmp = arr[i];
                arr[i] = st.peek();
                st.push(tmp);
            }
            i--;
        }
        return arr;
        
    }
}
