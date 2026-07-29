class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int preSum=0;
        int cnt=0;
        int n= arr.length;
        for(int i=0; i<n; i++){
            preSum += arr[i];
            int remove = preSum-k;
            cnt += map.getOrDefault(remove, 0);
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }
}