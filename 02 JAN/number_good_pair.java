//https://leetcode.com/problems/number-of-good-pairs/
//TC: O(n)
//SC: O(1)
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans=0;
        int count[] = new int[101]; // using frequency array to store the occurence
        for (int a: nums) {
            ans += count[a]++;   // like 1 1 1 1  //first time add 0 to and next time 1 then 2 the 3 so(1+2+3)=6
        }
        return ans;
        
    }
}