class Solution {
    public int myAtoi(String s) {

        int n = s.length();
        int i = 0;
        int sign = 1;
        long total = 0;

        // 1. Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Check sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Read digits
        while (i < n && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            total = total * 10 + digit;

            // 4. Handle overflow
            if (sign * total > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (sign * total < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        // 5. Return final answer
        return (int) (sign * total);
    }
}