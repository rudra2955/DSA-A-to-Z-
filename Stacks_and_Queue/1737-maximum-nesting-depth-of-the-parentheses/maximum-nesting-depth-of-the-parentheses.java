class Solution {
    public int maxDepth(String s) {
        int d=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                d++;
                max=Math.max(d,max);
            }
            else if(s.charAt(i)==')')d--;
            else continue;
        }
        return max;
    }

}