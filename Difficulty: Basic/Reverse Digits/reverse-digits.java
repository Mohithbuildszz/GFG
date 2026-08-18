class Solution {
    public int reverseDigits(int n) {
        // Code here
        if(n == 0){
            return n;
        } 
        int revnum = 0;
        while(n>0){
            int lastdigit = n % 10;
            revnum = (revnum * 10) + lastdigit;
            n = n/10;
        }
        return revnum;
    }
}