class Solution {
    public int[] sumZero(int n) {
        // int num=1;

        int []a= new int[n];
        if(n%2==0){
            int num1=1;
            
            for(int i=0;i<n/2;i++){
              a[i]=num1++;
            }
            for(int i=n/2;i<n;i++){
                a[i]= (-1)*a[i-n/2];
            }

        }
        else{
            int num1=1;
            for(int i=0;i<n/2;i++){
            a[i]=num1++;

            }
            for(int i=n/2;i<n-1;i++){
                a[i]= (-1)*a[i-n/2];
            }
            a[n-1]=0;
        }

        return a;
    }
}