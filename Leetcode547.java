class Solution {
    public void bfs(boolean vis[],int i,int adj[][]){
        vis[i] = true;
        Queue<Integer> que = new LinkedList<>();
        que.add(i);
        while(!que.isEmpty()){
            int node = que.poll();
            for(int j = 0;j < adj.length;j++){
                if(adj[node][j] == 1 && !vis[j]){
                    que.add(j);
                    vis[j] = true;
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        boolean vis[] = new boolean[isConnected.length];
          for(int i = 0;i < isConnected.length;i++){
            if(!vis[i]){
                bfs(vis,i,isConnected);
                count++;
            }
          }
           return count;
    }
}