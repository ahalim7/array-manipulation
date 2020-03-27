/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halim.lessons.arraymanipulation;

/**
 *
 * @author AbdElHalim
 */
public class Manipulator {

    public static void main(String[] args) {
        long result = arrayManipulation(5, new int[][]{{1, 2, 100},
        {2, 5, 100},
        {3, 4, 100}});
        System.out.println(result);
    }

    // Complete the arrayManipulation function below.
//    static long arrayManipulation(int n, int[][] queries) {
//        int[] arr = new int[n];
//        long max = 0;
//        for (int i = 0; i < queries.length; i++) {
//            int leftIndex = queries[i][0] - 1;
//            int rightIndex = queries[i][1] - 1;
//            for (int j = leftIndex; j <= rightIndex; j++) {
//                arr[j] += queries[i][2];
//                if (arr[j] > max) {
//                    max = arr[j];
//                }
//            }
//        }
//        return max;
//    }
    static long arrayManipulation(int n, int[][] queries) {
        long outputArray[] = new long[n + 2];
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];
            outputArray[a] += k;
            outputArray[b + 1] -= k;
        }
        long max = getMax(outputArray);
        return max;
    }

    private static long getMax(long[] inputArray) {
        long max = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
            max = Math.max(max, sum);
        }
        return max;
    }
}
