class Solution {
    public static boolean checkPangram(String s) {

        boolean[] visited = new boolean[26];
        s = s.toLowerCase();

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                visited[ch - 'a'] = true;
            }
        }

        for (boolean letter : visited) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }
}