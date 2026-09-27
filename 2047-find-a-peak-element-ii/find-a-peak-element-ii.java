class Solution {
    public static int findMaxIndex (int arr[][], int n, int m, int col){
        int maxVal=-1;
        int index = -1;
        for(int i=0; i<n; i++){
            if(arr[i][col]>maxVal){
                maxVal = arr[i][col];
                index = i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int low = 0;
        int high = m-1;
        while(low<=high){
            int mid = (low+high)/2;
            int maxRowIndex = findMaxIndex(arr,n,m,mid);
            int left = mid-1>=0 ? arr[maxRowIndex][mid-1]: -1;
            int right = mid+1<m ? arr[maxRowIndex] [mid+1]: -1;
            if(arr[maxRowIndex][mid] > left && arr[maxRowIndex][mid] >right){
                return new int[] {maxRowIndex , mid};
            }
            else if(arr[maxRowIndex] [mid] < left){
                high = mid -1;
            }
            else{
                low = mid+1;
            }
        }
        return new int[] {-1,-1};
    }
}