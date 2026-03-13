import java.util.HashSet;

class Solution {
    public int maxVowels(String s, int k) {
        int maxvowels = 0;
        int windowvowels = 0;
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {  
                windowvowels++;
            }
        }
        maxvowels = windowvowels;

        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i - k))) { 
                windowvowels--;
            }
            if (vowels.contains(s.charAt(i))) {    
                windowvowels++;
                maxvowels = Math.max(maxvowels, windowvowels);
            }
        }

        return maxvowels;  
    }
}