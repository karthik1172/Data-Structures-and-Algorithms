import java.util.*;
public class AllPathsFromSourcetoTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        cur.add(0);

        dfs(graph, 0, graph.length-1, res, cur);
        return res;
    }

    void dfs(int[][] g, int src, int des, List<List<Integer>> res, List<Integer> cur) {
        if(src == des) {
            res.add(new ArrayList<>(cur));
            return;
        }

        for(int x : g[src]) {
            cur.add(x);
            dfs(g, x, des, res, cur);
            cur.remove(cur.size()-1);
        }
    }
}
