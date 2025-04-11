class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        for(int i=0;i<aliceSizes.length;i++){
            sumA+=aliceSizes[i];
        }
        for(int i=0;i<bobSizes.length;i++){
            sumB+=bobSizes[i];
        }
        int avg = (sumB-sumA)/2;
        HashSet<Integer> hs = new HashSet<>();
        for (int b : bobSizes) {
            hs.add(b);
        }
        for (int a : aliceSizes) {
            int b = a + avg;
            if (hs.contains(b)) {
                return new int[]{a, b};
            }
        }
        return new int[0];
    }
}
