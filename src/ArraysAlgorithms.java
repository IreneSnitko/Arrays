import static utils.Utils.*;

public class ArraysAlgorithms {

    /*
    ~Task 1~
    Write an algorithm accepting
    array of numbers and returns
    an array of odd index values
    */

    private static int[] getOddIndices(int[] arr) {
        int index = 0;

        if (arr.length != 0) {

            int[] newArr = new int[arr.length / 2];

            for (int i = 0; i < arr.length; i++) {
                if (index < newArr.length && i % 2 != 0) {
                    newArr[index] = arr[i];
                    index++;
                }
            }

            return newArr;
        } else {

            return new int[]{};
        }
    }

    /*
    ~Task 2~
    Write an algorithm accepting
    an array of numbers and returns
    the sum of all the array numbers
    */

    private static int getSumArray(int[] arr) {
        int sum = 0;

        if (arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
        } else {
            sum = 0;
        }

        return sum;
    }

    /*
    ~Task 3~
    Write an algorithm accepting
    an array of integers, 2 indices values
    and returns an array, containing
    minimum, maximum and average values
    between these indices
    */

    private static int[] getMinMaxAve(int[] arr, int start, int end) {

        if (arr.length == 0
                || start < 0
                || end < 0
                || arr.length < end
                || start > end
        ) {

            return new int[]{};
        }

        int[] minMaxAve = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};

            for (int i = start; i < end + 1 ; i++) {

                if (arr[i] < minMaxAve[0]) {
                    minMaxAve[0] = arr[i];
                }
                if (arr[i] > minMaxAve[1]) {
                    minMaxAve[1] = arr[i];
                }
                minMaxAve[2] = minMaxAve[2] + arr[i];
            }

            minMaxAve[2] = minMaxAve[2]/(end - start + 1);

            return minMaxAve;
    }

    public static void main(String[] args) {

//  ~Task 1~ odd indices

        printArray(
                getOddIndices(
                new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}));  // [1, 3, 5, 7, 9]

        printArray(
                getOddIndices(
                new int[]{}));  // Out: []

//  ~Task 2~ sum array

        printThis(
                getSumArray(
                new int[]{-45, 590, 234, 985, 12, 68}));    // 1844

        printThis(
                getSumArray(
                new int[]{-7, -3}));    //10

//  ~Task 3~ min & max & ave

        printArray(
                getMinMaxAve(
                new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 3, 6));    // [3, 6, 4]
    }
}
