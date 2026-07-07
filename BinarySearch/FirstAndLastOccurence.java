// Find first and last occurrence of an element in sorted array
// Approach : Binary Search (Divide and Conquer)
// 1. Apply binary search to find the first occurrence of the element.
// 2. Apply binary search to find the last occurrence of the element.


class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int lo = 0;
        int hi = arr.length-1;
        int first = -1;
        int last = -1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] > x){
                hi = mid-1;
            }
            else if(arr[mid] < x){
                lo = mid+1;
            } 
            else if(arr[mid] == x){
                first = mid;
                hi = mid-1;
            }
        }
        lo = 0;
        hi = arr.length-1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] > x){
                hi = mid-1;
            } 
            else if(arr[mid] < x){
                lo = mid+1;
            }
            else if(arr[mid] == x){
                last = mid;
                lo = mid+1;
            }
        }
        ans.add(first);
        ans.add(last);
        return ans;
    }
}

