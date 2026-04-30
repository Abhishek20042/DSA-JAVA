class Solution {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceFirst(part, "");
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "abcdee";
        String part = "ab";

        Solution obj = new Solution();
        String ans = obj.removeOccurrences(s, part);

        System.out.println(ans);
    }
}