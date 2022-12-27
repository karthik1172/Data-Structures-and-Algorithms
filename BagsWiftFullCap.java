import java.util.*;
public class BagsWiftFullCap {
    public int maximumBags(int[] cap, int[] rocks, int add) {
        int[] dif = new int[cap.length];
        for(int i=0; i<dif.length; i++) {
            dif[i] = cap[i] - rocks[i];
        }
        Arrays.sort(dif);
        int cnt = 0;
        for(int i=0; i<cap.length; i++) {
            if(dif[i] - add <= 0) {
                cnt++;
                add -= dif[i];
            }
        }
        return cnt;
    }
}
