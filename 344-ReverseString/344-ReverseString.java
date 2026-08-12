// Last updated: 8/12/2026, 9:31:52 PM
class Solution {
    public void reverseString(char[] s) {
        int a=0,e=s.length-1;
        while(a<e){
            char temp=s[a];
            s[a]=s[e];
            s[e]=temp;
            a++;
            e--;
        }
            System.out.println(s);
            }
}