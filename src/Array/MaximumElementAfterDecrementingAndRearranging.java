package Array;

import java.util.Arrays;

public class MaximumElementAfterDecrementingAndRearranging {
    public static void main(String[] args) {
        //int[] arr = {2,2,1,2,1};
        int[] arr = {100,1,1000};
        int result = maximumElementAfterDecrementingAndRearranging(arr);
        System.out.println("The Maximum Element After Decrement and Rearrange: "+result);
    }

    public static int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        arr[0] = 1;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] - arr[i -1] > 1)  {
                arr[i] = arr[i-1] + 1;
            }
        }

        return arr[n -1];


    }
}
