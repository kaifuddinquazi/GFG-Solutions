// Binary Search in Descending Order
// Approach : Binary Search (Divide and Conquer)
// 1. Array is sorted in descending order.
// 2. Find the mid element of the array.
// 3. If the mid element is equal to the target element, return true.
// 4. If the mid element is greater than the target element, search in the right half of the array.
// 5. If the mid element is less than the target element, search in the left
public class BSinDescending {
    public static void main(String[] args) {
        int[] arr = { 9, 7, 5, 3, 1 };
        int target = 5;
        int lo = 0;
        int hi = arr.length-1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == target) {
                System.out.println("Target Found At Index :"+mid);
                break;
            }
            else if(arr[mid] > target){
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        }
    }
    
}
