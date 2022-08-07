package main;
import java.util.HashMap;

/** A class that contains several methods for manipulating an array of
 * integers.
 */
public class ArrayHelper {

    /** Print all elements of the given array
     *
     * @param arr array of integers
     */
    public static void print(int[] arr) {
        //TODO: Replace with your code.
        for (int ele : arr){
            System.out.println(ele);
        }
    }

    /** Returns the sum of all elements of the array
     *
     * @param arr array of integers
     * @return sum of elements
     */
    public static int sum(int[] arr) {
        //TODO: Replace with your code.
        int sum = 0;
        for(int ele : arr){
            sum += ele;
        }
        return sum;
    }

    /** Returns the product of all elements of the array
     *
     * @param arr array of integers
     * @return product of all elements
     */
    public static int product(int[] arr) {
        //TODO: Replace with your code.
        int product = 1;
        for(int ele : arr){
            product = product * ele;
        }
        return product;
    }

    /**
     * Returns true if all elements of given array are less then
     * the given threshold, and false otherwise
     * @param arr array of integers
     * @param thres threshold
     * @return
     */
    public static boolean threshold(int[] arr, int thres) {
        //TODO: Replace with your code.
        for(int ele : arr){
            if (ele > thres){
                return false;
            }
        }
        return true;
    }

    /** Returns true if elem is present in the array and false otherwise
     * Ex: If array is [8, 1, -4, 5, 2] and elem is 1, the method should return true.
     * If elem is 3, the method should return false, since 3 is not in the array

     * @param arr array of integers
     * @param elem integer value
     * @return
     */
    public static boolean find(int[] arr, int elem) {
        //TODO: Replace with your code.
        for(int ele:arr){
            if(ele == elem){
                return true;
            }
        }
        return false;
    }

    /** Returns the number of occurrences of elem in the given array.
     * Ex: if array is [9, 10, 0, 2, 5, 10, 3] and elem=10, the result is 2
     * @param arr array of integers
     * @param elem integer value
     * @return
     */
    public static int countOccurrences(int[] arr, int elem) {
        //TODO: Replace with your code.
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == elem){
                count++;
            }
        }
        return count;
    }

    /** Returns true if array of integers has duplicate elements,
     * and false otherwise.
     * Ex:
     * Given [3, 1, 2, 4, 1, 8], the method should return true
     * since 1 occurs twice
     *
     * @param arr array of integers
     * @return true if array has duplicates and false otherwise
     */
    public static boolean hasDuplicates(int[] arr) {
        //Using Hash Map
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                //{16=1, 1=1, 2=1, 3=1, -5=1, 8=1, 10=1}
                return true;
            }else {
                map.put(arr[i], 1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {8, 10, 1, 3, -5, 2, 16, 10, -12};
        int threshold = 9;
        int elem = 14;
        ArrayHelper.print(a);
        System.out.println("Sum of elements: " + ArrayHelper.sum(a));
        System.out.println("Product of elements: " + ArrayHelper.product(a));
        System.out.println("Compare with threshold " + threshold + ": " + ArrayHelper.threshold(a, threshold));
        System.out.println("Find " + elem + "? " + ArrayHelper.find(a, elem));
        System.out.println("Number of occurrences of 10: " + ArrayHelper.countOccurrences(a, 10));
        System.out.println("Check array for duplicates: " + ArrayHelper.hasDuplicates(a));

    }

}
