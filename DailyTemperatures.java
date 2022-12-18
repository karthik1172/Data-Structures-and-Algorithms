import java.util.*;
public class DailyTemperatures {
    class Pair {
        int val;
        int idx;
    }
    public int[] dailyTemperatures(int[] temp) {
        int[] res = new int[temp.length];
        Stack<Pair> st = new Stack<>();
        for(int i=0; i<temp.length; i++) {
            Pair p = new Pair();
            p.val = temp[i];
            p.idx = i;

            while(st.size() != 0 && st.peek().val < p.val) {
                res[st.peek().idx] = p.idx - st.peek().idx;
                st.pop();
            }
            st.push(p);
        }
        return res;
    }
}
