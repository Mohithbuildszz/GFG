class Solution {
    public int reverseDigits(int n) {
        // Code here
        if(n==0){
            return n;
        } 
        int revnum = 0;
        while(n>0){
            int last = n % 10;
            revnum = (revnum * 10) + last;
            n = n/10;
        } 
        return revnum;
    }
}