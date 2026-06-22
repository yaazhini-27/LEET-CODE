// Last updated: 6/22/2026, 2:04:15 PM
1class Solution {
2    public long zeroFilledSubarray(int[] nums) {
3        long count=0;
4        long ans=0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]==0){
7                count++;
8                ans+=count;
9            }
10            else{
11                count= 0;
12            }
13        }
14        return ans;
15    }
16}