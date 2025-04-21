class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> resultList = new ArrayList<>(map.keySet());
        resultList.sort((a, b) -> map.get(b) - map.get(a));
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = resultList.get(i);
        }

        return res;
    }
}
