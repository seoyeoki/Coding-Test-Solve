import java.util.ArrayList;
import java.util.Iterator;

class Solution {
    
    protected ArrayList<ArrayList<Integer>> edgesToNodes(int[][] edges, int n) {
        
        ArrayList<ArrayList<Integer>> nodes = new ArrayList<ArrayList<Integer>>(n);
        
        for (int i = 0; i < n; i++)
            nodes.add(new ArrayList<Integer>());
        
        for (int[] edge : edges) {
            nodes.get(edge[0] - 1).add(edge[1]);
            nodes.get(edge[1] - 1).add(edge[0]);
        }
        return nodes;
    }
    
    protected ArrayList<ArrayList<Integer>> getAllDists(ArrayList<ArrayList<Integer>> nodes, int n) {
        
        boolean[] visited = new boolean[n];
        ArrayList<ArrayList<Integer>> dists = new ArrayList<ArrayList<Integer>>(n + 1);
        
        for (int i = 0; i < n + 1; i++)
            dists.add(new ArrayList<Integer>());
        
        dists.get(0).add(1);
        visited[0] = true;
        
        for (int i = 0; i < n - 1; i++) {
            
            int current = i;
            
            dists.get(current).forEach(dIndex->{
                
                nodes.get(dIndex - 1).forEach(nIndex->{

                    if (!visited[nIndex - 1]) {
                        dists.get(current + 1).add(nIndex);
                        visited[nIndex - 1] = true;
                    }
                });
            });
        }
        return (dists);
    }
    
    public int solution(int n, int[][] edges) {
        
        int mDist;
        ArrayList<ArrayList<Integer>> nodes = edgesToNodes(edges, n);
        ArrayList<ArrayList<Integer>> dists = getAllDists(nodes, n);
        
        for (mDist = 0; mDist <= n; mDist++)
        {
            if (dists.get(mDist).isEmpty() == true)
            {
                mDist--;
                break;
            }
        }
        /*System.out.println(nodes);
        System.out.println(mDist);
        System.out.println(dists);
        */
        return dists.get(mDist).size();
    }
}