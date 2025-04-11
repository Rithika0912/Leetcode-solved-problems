import java.util.*;

class Solution {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int n = tasks.length;
        int i = 0, ans = 0;

        while (i < n) {
            int count = 1;
            while (i + count < n && tasks[i] == tasks[i + count]) {
                count++;
            }
            if (count == 1) return -1;
            ans += (count + 2) / 3; 

            i += count;
        }

        return ans;
    }
}
