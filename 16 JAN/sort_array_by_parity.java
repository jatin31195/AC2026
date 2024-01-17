//https://leetcode.com/problems/sort-array-by-parity/
//TC: O(n)
//SC: O(n)
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int temp[]=new int[nums.length];
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]%2)==0){
            temp[cnt]=nums[i];
            cnt++;}
        }
        for(int i=0;i<nums.length;i++){
            if((nums[i]&1)==1){
                temp[cnt++]=nums[i];
            }
        }
        return temp;
    }
}