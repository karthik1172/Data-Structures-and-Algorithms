public class JumpGame {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];

        dp[nums.length-1] = true;

        for(int i=nums.length-2; i>=0; i--) {
            int val = nums[i];
            for(int j=0; j<=val && i+j < dp.length; j++) {
                dp[i] = dp[i] | dp[i+j];
            }
        }
        return dp[0];
    }
}
