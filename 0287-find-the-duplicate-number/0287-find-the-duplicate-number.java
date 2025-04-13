class Solution {
    public int findDuplicate(int[] nums) {
        int ele=-1;
        HashSet<Integer> as=new HashSet<>();
        for(int a:nums){
            if(as.contains(a)){
                 ele=a;
                 break;
            }
            else as.add(a);
        }
        return ele;
    }
}