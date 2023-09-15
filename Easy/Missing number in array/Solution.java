

// User function Template for Java

class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int ans=0;
        int sum = n*(n+1)/2;
        for(int i=0; i<n-1; i++){
            sum-=array[i];
        }
    return sum;
    }
}
