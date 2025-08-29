class Solution {
    public char findTheDifference(String s, String t) {
        int xor=0;
        for(char c:s.toCharArray())xor^=c;
        for(char b:t.toCharArray())xor^=b;

        return (char)xor;
    }
}