class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] copy=nums.clone();
        for(int i=0;i<nums.length;i++){
            copy[i]=copy[i]*copy[i];
        }
         Arrays.sort(copy);
         return copy ;
    }
}