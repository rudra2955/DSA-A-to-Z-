class Solution {
    public boolean isPalindrome(String s) {
        String st= s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String check= new StringBuilder(st).reverse().toString();

        if(st.equals(check))return true;
        return false;
    }
}