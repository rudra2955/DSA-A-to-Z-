// class Solution {
//     public int hammingWeight(int n) {
        // Stack<Integer>st= new Stack<>();
        // int count=0;
        // while(n>0){
        //     st.push(n%2);
        //     n=n/2;
        // }
        // while(!st.isEmpty()){
        //     int k= st.pop();
        //     if(k==1)count++;
        //     else continue;
        // }
        // return count;
      
//     }
// }

class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            
            if ((n & 1) == 1) count++;
           
            n >>>= 1; 
        }
        return count;
    }
}