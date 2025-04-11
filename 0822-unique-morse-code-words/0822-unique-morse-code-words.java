class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] sym = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                        ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                        "...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet<String> hs = new HashSet<>();

        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(sym[c - 'a']);
            }
            hs.add(sb.toString());
        }

        return hs.size();
    }
}
