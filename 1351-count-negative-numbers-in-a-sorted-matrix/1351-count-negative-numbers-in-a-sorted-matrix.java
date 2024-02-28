class Solution {
    public int countNegatives(int[][] grid) {
        
        int count=0;
        for(int[] arr:grid) 
        {
            for(int anu:arr)
            {
                if(anu<0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}