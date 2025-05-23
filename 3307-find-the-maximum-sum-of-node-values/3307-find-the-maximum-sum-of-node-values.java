class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long sum = 0;
        int countPositiveDelta = 0;
        int minAbsDelta = Integer.MAX_VALUE;

        for (int num : nums) {
            int xorVal = num ^ k;
            int delta = xorVal - num;
            if (delta > 0) {
                sum += xorVal;
                countPositiveDelta++;
            } else {
                sum += num;
            }
            minAbsDelta = Math.min(minAbsDelta, Math.abs(delta));
        }
        if (countPositiveDelta % 2 != 0) {
            sum -= minAbsDelta;
        }

        return sum;
    }
}
