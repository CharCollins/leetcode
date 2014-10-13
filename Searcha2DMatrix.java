public class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length,col=matrix[0].length;
        if(row==0||col==0) return false;
        if(target<matrix[0][0]) return false;
        int start=0,end=row-1,mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(matrix[mid][0]==target) return true;
            if(matrix[mid][0]>target) end=mid-1;
            else start=mid+1;
        }
        int r=end;//targetRow
        start=0;end=col-1;
        while(start<=end){
            mid=(start+end)/2;
            if(matrix[r][mid]==target) return true;
            if(matrix[r][mid]>target) end=mid-1;
            else start=mid+1;
        }
        return false;
        /**basic solution
        int row=matrix.length,col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==target) return true;
            }
        }
        return false;
        */
    }
}
