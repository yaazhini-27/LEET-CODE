// Last updated: 6/24/2026, 11:34:12 AM
1class Solution {
2    public void sortColors(int[] nums) {
3        for(int i=0;i<nums.length-1;i++){
4            for(int j=i+1;j<nums.length;j++){
5                if(nums[i]>nums[j]){
6                    int temp=nums[i];
7                    nums[i]=nums[j];
8                    nums[j]=temp;
9                }
10            }
11        }
12    }
13}
14// class Solution {
15//     public void sortColors(int[] nums) {
16//         for (int i = 0; i < nums.length - 1; i++) {
17//             for (int j = i + 1; j < nums.length; j++) {
18//                 if (nums[i] > nums[j]) {
19//                     int temp = nums[i];
20//                     nums[i] = nums[j];
21//                     nums[j] = temp;
22//                 }
23//             }
24//         }
25//     }
26// }