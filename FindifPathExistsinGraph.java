import java.util.*;
public class FindifPathExistsinGraph {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i=0; i<n; i++) {
            graph.add(i, new ArrayList<>());
        }

        for(int i=0; i<edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        LinkedList<Integer> q = new LinkedList<>();
        HashSet<Integer> vist = new HashSet<>();

        q.addLast(source);

        while(q.size() != 0) {
            int fst = q.removeFirst();
            if(fst == destination) {
                return true;
            }
            vist.add(fst);
            int size = graph.get(fst).size();
            for(int i=0; i<size; i++) {
                int val = graph.get(fst).get(i);
                if(vist.contains(val) == false) {
                    q.addLast(val);
                }
            }
        }
        return false;
    }

}
/*
 */