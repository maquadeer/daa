/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfs;
import java.util.*;

/**
 *
 * @author name
 */
public class BFS {

     int vertices;
     int adjMat[][];

    public BFS() {
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
    }

    public void bfs(int s) {
        int i = s;
        Queue<Integer> q = new LinkedList<Integer>();
        int visited[] = new int[vertices];
        System.out.print(i+" ");
        visited[i] = 1;
        q.add(i);
        while(!q.isEmpty()) {
            i = q.remove();
            for(int j=0;j<vertices;j++) {
                if(adjMat[i][j]==1 && visited[j] ==0) {
                    System.out.print(j+" ");
                    visited[j] = 1;
                    q.add(j);
                }
            }
        }
    }

    public static void main(String args[]) {
        BFS b = new BFS();
        System.out.println("BFS:");
        b.bfs(0);
    }
}
