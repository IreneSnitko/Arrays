package Utils;

import java.util.Arrays;
import java.util.List;

public class Utils {

    public static void emptyLine() {
        System.out.println();
    }

    public static int getCount(int start, int end, int step) {
        int count = 0;

        if (count >= 0) {
            for (int i = start; i < end; i += step) {
                count++;
            }
        } else {
            count = 0;
        }

        return count;
    }

    public static int getCountOfOddNums(int start, int end, int step) {
        int count = 0;

        if (count >= 0) {
            for (int i = start; i < end; i += step) {
                if (i % 2 != 0){
                    count++;
                }
            }
        }
        else {
            count = 0;
        }

        return count;
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printList(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
        }
        emptyLine();
    }

    public static int getRandomNumber(int end, int start) {

        return (int) (Math.random() * ((end - start) + 1)) + start;
    }

    public static int getAverage(int[] arr) {
        double average = 0.0;
        int sum = 0;

        if (arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                average = Math.round(sum / arr.length);
            }
        }
        return (int)average;
    }

    public static void printThis(int a) {
        System.out.println(a);
    }

    public static int getMin(int[] arr) {
        Arrays.sort(arr);

        return  arr[0];
    }

    public static int getMax(int[] arr) {
        Arrays.sort(arr);

        return arr[arr.length - 1];
    }

    public static void print2DArray(int[][] arr, int i, int j) {
        System.out.print(arr[i][j] + "     ");
    }

    public static void print2DArray(String[][] arr, int i, int j) {
        System.out.print(arr[i][j] + "  ");
    }
}
