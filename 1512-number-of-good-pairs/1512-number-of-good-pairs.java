import java.util.*;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> count = new HashMap<>();
        
        //keep track of number of times a value appears in the entire array in a hashmap
        for(int num: nums){
            count.put(num, count.getOrDefault(num, 0)+1);
        }
         
        /*
        the number of pairs that can be formed given there is total of n number of element m is simply sum of all natural numbers up to n-1
        - formula: (n-1)(n)/2
        - explanation: if there are 3 ones in array, they must be appearing in sequence in the array
        -- the first one has 2 ones after it
        -- the second one has only 1 one after it and the last one has none after it
        -- so the total number of pair is 2 + 1 + 0 
        */
        for(int n: count.values()){
            if(n > 1){
                res += (n-1)*(n)/2;
            }
        }
        return res;
    }
}