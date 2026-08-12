// Last updated: 8/12/2026, 9:31:32 PM
class Solution {
    public int findComplement(int num) {
        int mask=0;
        int temp=num;
        while(temp>0){
            mask=(mask<<1)|1;
            temp>>=1;
        }
        return num^mask;
    }
}