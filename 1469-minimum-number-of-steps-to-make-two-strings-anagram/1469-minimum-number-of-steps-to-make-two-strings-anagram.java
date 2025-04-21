class Solution {
    public int minSteps(String s, String t) {
        int[] charCounts = new int[26]; 
        for (char ch : s.toCharArray()) {
            charCounts[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            if (charCounts[ch - 'a'] > 0) {
                charCounts[ch - 'a']--;
            }
        }
        int steps = 0;
        for (int count : charCounts) {
            steps += count;
        }

        return steps;
    }
}
