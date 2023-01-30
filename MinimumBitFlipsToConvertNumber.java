public class MinimumBitFlipsToConvertNumber {
    public int minBitFlips(int start, int goal) {
        int cnt = 0;
        int i = 1;
        int n = 1000000000;
        while(i <= n) {
            if((i & start) != (i & goal)) {
                cnt++;
            }
            i = i<<1;
        }
        return cnt;
    }
}
