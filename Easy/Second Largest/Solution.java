//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int second = -1;
        int first = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>first){
                second = first;
                first= arr[i];
            }
        }
        return second;
    }
}
