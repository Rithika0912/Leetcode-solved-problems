class Solution {
    public int countLargestGroup(int n) {
        int[] arr = new int[37];
        int maxSize = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int num = i, sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            arr[sum]++;
            maxSize = Math.max(maxSize, arr[sum]);
        }
        for (int counts : arr) {
            if (counts == maxSize) {
                count++;
            }
        }

        return count;
    }
}
