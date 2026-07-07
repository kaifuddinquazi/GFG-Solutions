/* Problem Binary Search
Platform : GeeksForGeeks
Approach : Binary Search (Divide and Conquer)
1. Find the mid element of the array.
2. If the mid element is equal to the target element, return true.
3. If the mid element is greater than the target element, search in the left half of the array.
4. If the mid element is less than the target element, search in the right half of the array.
Time Complexity : O(log n)
 */

class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        int lo = 0;
        int hi = arr.length-1;
        while ( lo <= hi){
          int  mid = (lo + hi)/2;
           if(arr[mid] == k){
               return true;
           } 
           else if ( arr[mid] > k) {
               hi = mid-1;
           } else {
               lo = mid+1;
           }
           
        }
        return false;
    }
}