class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;
        if(arr.length == 0) return false;

        int low =0;
        int high = n*m -1;

        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid/m] [mid%m] == target){
                return true;
            }
            if(arr[mid/m] [mid%m] < target){
                low=mid+1;
            }else{
                high = mid - 1;
            }
        }
        return false;
    }
}