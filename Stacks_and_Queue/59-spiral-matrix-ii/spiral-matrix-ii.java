class Solution {
    public int[][] generateMatrix(int n) {
        int[][]a=new int[n][n];
        
         int top=0, bottom=n-1, left=0, right=n-1;
        int num=1;

        while(left<=right && top<=bottom){
          
            for(int i=left;i<=right;i++){
                a[top][i]= num++;
            }
            top++;

            
            for(int i=top;i<=bottom;i++){
                a[i][right]=num++;
            }
            right--;

            
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    a[bottom][i]=num++;
                }
                bottom--;
            }

            
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                   a[i][left]=num++;
                }
                left++;
            }
        }
return a;
    }
}