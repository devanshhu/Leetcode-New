class Solution
{
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int[] color = new int[V];
        Arrays.fill(color, -1);
        for(int i=0;i<V;i++){
            if(color[i] == -1)
                if(!checkBipartiteBFS(i, V, color, adj )) return false;
        }
        return true;
    }
    
    public boolean checkBipartiteBFS(int src, int V, int[] color, ArrayList<ArrayList<Integer>>adj){
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
    public boolean checkBipartiteDfs(int src,int col, int[] color, ArrayList<ArrayList<Integer>>adj){
        color[src] = col;
        for(int it: adj.get(src)){
            if(color[it] == -1){
                if(checkBipartiteDfs(it,1-col,color, adj) == false) return false;
            }else if(color[it] == col) return false;
        }
        
        return true;
      }
}
