class Solution {
    public boolean isAnagram(String s, String t) {
        int alphabet[] = new int[26];

        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
            alphabet[t.charAt(i) - 'a']--;
        }

        for (int n : alphabet)
            if (n != 0)
                return false;

        return true;
    }
}