// Last updated: 6/9/2026, 3:44:44 PM
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3         if(n<=0){
4            return false;
5        }
6        while(n>1){
7            if(n%2!=0)
8            {
9                return false;
10            }
11            n=n/2;
12        }
13        return true;
14        
15    }
16}