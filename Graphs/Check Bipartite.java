class Solution
{
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int[] color = new int[V];
        Arrays.fill(color, -1);
        for(int i=0;i<V;i++){
            if(color[i] == -1)
                if(!checkBipartite(i, V, color, adj )) return false;
        }
        return true;
    }
    
    public boolean checkBipartite(int src, int V, int[] color, ArrayList<ArrayList<Integer>>adj){
        Queue<Integer> q = new LinkedList();
        color[src] = 0;
        q.add(src);
        while(!q.isEmpty()){
            int node = q.remove();
            for(int it: adj.get(node)){
                if(color[it] == -1){
                    color[it] = 1 - color[node];
                    q.add(it);
                }else if(color[it] == color[node]) return false;
            }
        }
        return true;
        
    }
}
