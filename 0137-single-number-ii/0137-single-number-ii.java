class Solution {
    public int singleNumber(int[] nums) {
        
        Arrays.sort(nums);
        int ele=-1;
        if(nums.length==1) ele=nums[0];
        for(int i=0;i<nums.length;i++){
            int count=1;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i!=j) count++;
            }
            if(count==1) ele=nums[i];
        }
        return ele;

    }
}