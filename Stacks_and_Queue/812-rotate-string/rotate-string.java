class Solution {
    public boolean rotateString(String s, String goal) {
        String z=s+s;
        if(s.length()!=goal.length())return false;
        if(z.contains(goal))return true;
        else return false;
    }
}