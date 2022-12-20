import java.util.*;
public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> vis = new HashSet<>();

        Stack<Integer> s = new Stack<>();
        s.push(0);

        while(s.size() != 0) {

            int n = s.size();
            for(int i=0; i<n; i++) {
                int val = s.pop();
                vis.add(val);
                for(int key : rooms.get(val)) {
                    if(vis.contains(key) == false)
                        s.push(key);
                }
            }
        }
        return vis.size() == rooms.size();
    }
}
