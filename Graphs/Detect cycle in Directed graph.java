
class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean[] visited = new boolean[V];
        boolean[] pathVisited = new boolean[V];
        
        for(int i=0;i<V;i++){
            if(visited[i] == false){
                if(checkCycledfs(i,visited, pathVisited, adj)) return true;
            }
        }
        return false;
    }
    
    public boolean checkCycledfs(int node, boolean[] visited, boolean[] pathVisited, ArrayList<ArrayList<Integer>> adj){
        if(pathVisited[node]) return true;
        pathVisited[node] = true;
        visited[node]= true;
        for(int neighbour : adj.get(node)){
            if(visited[neighbour] == false){
                if(checkCycledfs(neighbour, visited, pathVisited, adj)) return true;
            }
            else if(pathVisited[neighbour]) return true;
        }
        pathVisited[node]= false;
        return false;
    }
}
