// Last updated: 6/9/2026, 4:16:50 PM
1class Solution {
2    public boolean isPowerOfFour(int n) {
3        if(n<=0)
4        {
5            return false;
6        }
7        while(n>1){
8            if(n % 4 != 0){
9                return false;
10            }
11        n=n/4;
12        }
13    return true;
14    }
15}
16    