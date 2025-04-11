class Solution {
    public int repeatedNTimes(int[] nums) {
       int n=nums.length/2;
       int ele=0;
       Arrays.sort(nums);
       for(int i=0;i<nums.length-1;i++){
        int count=1;
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]) count++;
        }
        if(count==n) ele=nums[i];
       } 
       return ele;
    }
}