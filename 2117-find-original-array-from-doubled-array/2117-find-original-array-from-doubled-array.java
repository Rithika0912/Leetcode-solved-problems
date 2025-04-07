class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if (n % 2 != 0) return new int[0];

        Arrays.sort(changed);
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> original = new ArrayList<>();

        for (int num : changed) {
            if (!queue.isEmpty() && queue.peek() == num) {
                queue.poll();  
            } else {
                original.add(num);      
                queue.offer(num * 2);   
            }
        }

        return queue.isEmpty() ? original.stream().mapToInt(i -> i).toArray() : new int[0];
    }
}

