import java.util.*;
public class SumofDistancesinTree {
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0; i<n; i++) {
            adj.add(i, new ArrayList<Integer>());
        }

        for(int i=0; i< edges.length; i++) {
            int x = edges[i][0];
            int y = edges[i][1];

            adj.get(x).add(y);
            adj.get(y).add(x);
        }

        int[] nodes = new int[n];
        int[] res = new int[n];
        helper1(adj, nodes, res, 0, -1);
        helper2(adj, nodes, res, 0, -1);
        return res;
    }

    public void helper1(ArrayList<ArrayList<Integer>> adj, int[] nodes, int[] res, int src, int parent) {

        for(int nbr : adj.get(src)) {
            if(nbr != parent) {
                helper1(adj, nodes, res, nbr, src);
                nodes[src] += nodes[nbr];
                res[src] += nodes[nbr] + res[nbr];
            }
        }
        nodes[src]++;
    }

    public void helper2(ArrayList<ArrayList<Integer>>adj, int[] nodes, int[] res, int src, int parent) {
        for(int nbr : adj.get(src)) {
            if(nbr != parent) {
                res[nbr] = res[src] + (nodes.length - nodes[nbr]) - (nodes[nbr]);
                helper2(adj, nodes, res, nbr, src);
            }
        }
    }
}
