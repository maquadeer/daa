/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfs;

/**
 *
 * @author student
 */
public class DFS {
 int vertices;
   int adjMat[][];
int visited[];
    public DFS() {
        vertices = 8;
        adjMat = new int[][]{
                {0,1,1,0,0,0,0,0},
                {1,0,0,1,1,0,0,0},
                {1,0,0,0,0,1,1,0},
                {0,1,0,0,0,0,0,1},
                {0,1,0,0,0,0,0,1},
                {0,0,1,0,0,0,0,1},
                {0,0,1,0,0,0,0,1},
                {0,0,0,1,1,1,1,0}
        };
        visited = new int[vertices];
    }
  public void dfs(int s) {
      if(visited[s]==0) { 
            System.out.print(s+" ");
            visited[s] = 1;
             for(int j=0;j<vertices;j++) {
                if(adjMat[s][j]==1 && visited[j] ==0) {
                    dfs(j);
                }
      }
     }
  }
    
    public static void main(String[] args) {
        // TODO code application logic 
          DFS b = new DFS();
        System.out.println("DFS:");
        b.dfs(0);
    }
    
}
