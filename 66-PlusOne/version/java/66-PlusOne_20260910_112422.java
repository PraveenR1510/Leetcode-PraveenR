// Last updated: 9/10/2026, 11:24:22 AM
1class Solution {
2    public int[] plusOne(int[] digits) {
3        
4        int n=digits.length;
5        for(int i=n-1;i>=0;i--){
6            if(digits[i]<9){
7                digits[i]++;
8                return digits;
9            }
10
11            digits[i]=0;
12        }
13
14        int res[]=new int[n+1];
15        res[0]=1;
16        return res;
17    }
18}