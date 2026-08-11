//CODE 1
// class Solution {
//     public static int lowerBound(int arr[], int target){
//         int n =arr.length;
//         int low=0;
//         int high =n-1;
//         int ans =n;
//         while(low<=high){
//             int mid=(low+high)/2;
//             if(arr[mid]>=target){
//                 ans= mid;
//                 high = mid-1;
//             }else{
//                 low= mid+1;
//             }
//         }
//         return ans;
//     }
//     public static int upperBound(int arr[], int target){
//         int n = arr.length;
//         int low=0;
//         int high =n-1;
//         int ans =n;
//         while(low<=high){
//             int mid=(low+high)/2;
//             //just comparison operator difference
//             if(arr[mid]>target){
//                 ans= mid;
//                 high = mid-1;
//             }else{
//                 low= mid+1;
//             }
//         }
//         return ans;
//     }
//     public int[] searchRange(int[] arr, int target) {
//         int n=arr.length;
//         int lb = lowerBound(arr, target);
//         if(lb==n || arr[lb] != target){
//             return new int[]{-1,-1};
//         } 
//         return new int[] {lb, upperBound(arr, target)-1};
//     }
// }


//CODE 2
class Solution{
    public static int firstOccurance(int arr[], int target){
        int n = arr.length;
        int low=0;
        int high = n-1;
        int first =-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                first =mid;
                high = mid-1;
            }else if(arr[mid]<target){
                low= mid+1;
            }else{
                high=mid-1;
            }
        }
        return first;
    }
    public static int lastOccurance(int arr[], int target){
        int n = arr.length;
        int low=0;
        int high = n-1;
        int last =-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                last =mid;
                low = mid+1;
            }else if(arr[mid]<target){
                low= mid+1;
            }else{
                high=mid-1;
            }
        }
        return last;
    }

     public int[] searchRange(int[] arr, int target){
        int first = firstOccurance(arr, target);
        if(first == -1){
            return new int[]{-1,-1};
        }
        int last= lastOccurance(arr, target);
        return new int[]{first,last};
     }
}