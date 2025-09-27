class Solution {
    public double largestTriangleArea(int[][] a) {
        int n=a.length;
        double area=0.0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    int x1=a[i][0] ,y1=a[i][1];
                    int x2=a[j][0] ,y2=a[j][1];
                    int x3=a[k][0] ,y3=a[k][1];
                   double result = 0.5 * Math.abs(
                        x1 * (y2 - y3) +
                        x2 * (y3 - y1) +
                        x3 * (y1 - y2)
                    );
                   area=Math.max(area,result);

                }
                
            }
        }
        return area;
    }
}