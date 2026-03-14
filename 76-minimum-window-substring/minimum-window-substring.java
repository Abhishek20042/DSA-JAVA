class Solution {

    public String minWindow(String s, String t) {

        int[] mapS = new int[256]; 
        int[] mapT = new int[256]; 
        for (char ch : t.toCharArray()) {
            mapT[ch]++;
        }

        int left = 0;
        int start = 0;
        int minlen = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            mapS[ch]++;

            while (contains(mapS, mapT)) {

                if (right - left + 1 < minlen) {
                    minlen = right - left + 1;
                    start = left;
                }

                char l = s.charAt(left);
                mapS[l]--;
                left++;
            }
        }

        if (minlen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minlen);
    }

    private boolean contains(int[] mapS, int[] mapT) {

        for (int i = 0; i < 256; i++) {
            if (mapS[i] < mapT[i]) {
                return false;
            }
        }

        return true;
    }
}