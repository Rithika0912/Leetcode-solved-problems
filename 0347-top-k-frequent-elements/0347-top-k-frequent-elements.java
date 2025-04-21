class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> resultList = new ArrayList<>();
        frequencyMap.entrySet()
            .stream()
            .sorted((a, b) -> b.getValue() - a.getValue())
            .limit(k) 
            .forEach(entry -> resultList.add(entry.getKey()));
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}