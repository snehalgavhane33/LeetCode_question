class Solution {
    public static int findDays(int arr[],int cap){
        int n = arr.length;
        int days = 1;
        int load = 0;
        for(int i=0; i<n; i++){
            if(arr[i]+load> cap){
                days++;
                load=arr[i];
            }else{
                load+=arr[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] arr, int days) {
        int n = arr.length;
        int low = 0;
         int high = 0;
         for(int i=0; i<n; i++){
            low = Math.max(low,arr[i]);
            high+=arr[i];
         }
         while(low<=high){
            int mid = (low+high)/2;
            int numberOfDays=findDays(arr,mid);
            if(numberOfDays<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
         }
         return low;

    }
}