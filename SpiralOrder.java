class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int r1=0,r2=n-1;
        int c1=0,c2=m-1;

        while(r1<=r2 && c1<=c2){
            for(int c=c1;c<=c2;c++)
                result.add(matrix[r1][c]);
            for(int r=r1+1;r<=r2;r++)
                result.add(matrix[r][c2]);

            if(r1<r2 && c1<c2){
                for(int c=c2-1;c>=c1;c--)
                    result.add(matrix[r2][c]);
                for(int r=r2-1;r>r1;r--)
                    result.add(matrix[r][c1]);
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return result;
        
    }
}
