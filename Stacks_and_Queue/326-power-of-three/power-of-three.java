class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1) return true;
        else if(n<=0 ||n==2)return false;
        else{
            while(n>3){
                if(n%3!=0)return false;
                else{
                    n/=3;
                }
            }
            return n==3;
        }
        // if(n<=0)return false;
        // if(n==1) return true;
        // if((n&n-1)%2==0) return true;
        // return false;
    }
}