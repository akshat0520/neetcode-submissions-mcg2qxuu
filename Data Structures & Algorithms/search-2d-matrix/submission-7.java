class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        //matrix[i][0];
        int l=0;
        int r=rows-1;
        int mid=(r-l)/2;
        while(l<r)
        {
            if(matrix[mid][0]==target)
            {
                return true;
            }
            else if(matrix[mid][0]<target)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
            mid=l+(r-l)/2;
        }
        if(matrix[l][0]==target)
        {
            return true;
        }
        if(mid==0)
        {
            l=mid;
        }
        else if(matrix[mid][0]<target)
        {
            l=mid;
        }
        else
        {
            l=mid-1;
        }
        int l1=0;
        r=columns-1;
        mid=(r-l1)/2;
        if(matrix[l][mid]==target)
        {
            return true;
        }
        while(l1<=r)
        {
            if(matrix[l][mid]==target)
            {
                return true;
            }
            else if(matrix[l][mid]>target)
            {
                r=mid-1;
            }
            else
            {
                l1=mid+1;
            }
            mid=l1+(r-l1)/2;
        }
        return false;
    }
}

