class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] abi = new int[2];
        
        for(int i = 0;i<nums.length;i++)
        {
            for(int j =i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j] == target)
                    
                {
                    abi[0]=i;
                    abi[1]=j;
                    return abi;
                }
            }
        }
        int[] empty = new int[2];
        return empty;
    }
}