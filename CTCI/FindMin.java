/*
 *  A sorted array has been rotated so that the elements might appear in the order 
 *  3 4 5 6 7 1 2. How would you find the minimum element? You may assume that the array has
 *  all unique elements
 */
public class FindMin {
    
    public static void binarySearch (int[] a, int from, int to) {
        int low  = from;
        int high = to;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if      (a[mid] > a[high]) low  = mid + 1;
            else if (a[mid] < a[high]) high = mid;   
            else    {
                System.out.println(a[mid]);
                break;
            }
        }
    }

    public static void findMin (int[] shiftedArray) {        
        int len = shiftedArray.length;
        if (len > 0) {
            /* Base: if left most is less than right most, then it is already a sorted array. 
             * So, the minimum element will be at the first index */
            if (shiftedArray[0] < shiftedArray[len-1]) {
                System.out.println(shiftedArray[0]);
            }
            else binarySearch(shiftedArray, 0, len-1);
        }
    }
    
    public static void main(String[] args) {
        findMin(new int[] {3, 4, 5, 6, 7, 8, 10, 12, 18, 100, 204, 258, -12, -9, 0, 1, 2});   
        findMin(new int[] {258, 204, 100, -12, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 18}); 
        findMin(new int[] {7, 8, 10, 12, 18, 258, 204, 100, -12, -9, 0, 1, 2, 3, 4, 5, 6}); 
        findMin(new int[] {-12, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 18, 100, 204, 258, -12, -12});   
    }

}
