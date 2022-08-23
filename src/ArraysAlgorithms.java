public class ArraysAlgorithms {

    /*
    ~Task 1~
    Write an algorithm accepting
    array of numbers and returns
    an array of odd index values
    */

    public static int[] getOddIndices(int[] arr) {
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

    public static int getSumArray(int[] arr) {
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

    public static int[] getMinMaxAve(int[] arr, int start, int end) {

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

    /*
    ~Task 4~
    Write an algorithm accepting
    an array of integers and returns
    the array with the values of peak elements
    (elements that are larger than their neighbors)
    */

    public static int[] getPeakElementsArray (int[] arr) {
        int newLength = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 && arr[0] > arr[1]) {

                newLength++;
            }
            else if (i > 0
                    && i < arr.length - 1
                    && arr[i] > arr[i - 1]
                    && arr[i] > arr[i + 1]) {

                newLength++;
            }
            else if (arr[arr.length - 1] > arr[arr.length - 2]) {

                newLength++;
            }
        }

        int[] newArr = new int[newLength];
        int index = 0;

        if (arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i == 0 && arr[0] > arr[1]) {
                    newArr[index] = arr[0];
                    index++;
                }
                else if (i > 0
                        && i < arr.length - 1
                        && arr[i] > arr[i - 1]
                        && arr[i] > arr[i + 1]) {
                    newArr[index] = arr[i];
                    index++;
                }
                else if (arr[arr.length - 1] > arr[arr.length - 2]) {
                    newArr[index] = arr[arr.length - 1];
                    index++;
                }
            }
        } else {

            return new int[]{};
        }

        return newArr;
    }

    /*
    ~Task 5~
    Write an algorithm accepting
    two array of integers and returns
    an array of common elements
    */

    public static int[] getArrayIntersection(int[] arr1, int[] arr2) {

        if (arr1.length == 0 || arr2.length == 0) {

            return new int[]{};
        }

        int l = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    l++;
                }
            }
        }

        int[] newArr = new int[l];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    newArr[index] = arr1[i];
                    index++;
                }
            }
        }

        return newArr;
    }

    /*
    ~Task 6~
    Write an algorithm accepting
    an array of integers and returns
    the "reverse" array
    */

    public static int[] getReverseArray(int[] arr) {
        int tempo = 0;

        for (int i = 0; i < arr.length / 2; i++) {

            tempo = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = tempo;
        }

        return arr;
    }

    public static int[] getReverseArrayWitCounterDecreasing(int[] arr) {

        int[] reverse = new int[arr.length];
        int index = arr.length -1;

        for (int i = 0; i < arr.length; i++) {
            reverse[index] = arr[i];
            index--;
        }

        return reverse;
    }

    /*
    ~Task 7~
    Write an algorithm accepting
    an array of integers and sorts
    the array elements in ascending order
    */

    public static int[] getSortedArray(int[] arr) {
        if (arr.length == 0) {

            return new int[]{};
        }

        int tempo = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    tempo = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempo;
                }
            }
        }

        return arr;
    }

    /*
    ~Task 8~
    Write an algorithm accepting
    an array of integers and returns
    the array in which all negative numbers
    are in the second half of the array
    */

    public static int[] getNegativeOnTheRight(int[] arr) {

        int[] newArr = new int[arr.length];
        int index1 = arr.length - 1;
        int index2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                newArr[index1] = arr[i];
                index1--;
            } else {
                newArr[index2] = arr[i];
                index2++;
            }
        }

        return  newArr;
    }
}