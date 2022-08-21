package utils;

import java.util.Arrays;
import java.util.List;

public class Utils {

    public static boolean containsNegativeNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {

                return true;
            }
        }

        return false;
    }

    public static int getArrayLengthWithConditions(int start, int end, int step) {
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

    public static int getArrayLengthOfOddNums(int startBetween, int endBetween, int step) {
        int count = 0;

        if (count >= 0) {
            for (int i = startBetween; i < endBetween; i += step) {
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

    public static int getLength(int l) {
        if (l > 0 && l < Integer.MAX_VALUE) {
            l = l;
        }
        else if (l < 0 && l > Integer.MIN_VALUE) {
            l = l * (-1);
        }

        return l;
    }

    public static int getRandomWithBorder(int border) {

        return (int) (Math.random()* border);
    }

    public static int getRandomNumberInInterval(int end, int start) {

        return (int) (Math.random() * ((end - start) + 1)) + start;
    }

    public static double getRandomNumberInInterval(double end, double start) {

        return (Math.random() * ((end - start) + 1)) + start;
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

    public static int getMin(int[] arr) {
        Arrays.sort(arr);

        return  arr[0];
    }

    public static int getMax(int[] arr) {
        Arrays.sort(arr);

        return arr[arr.length - 1];
    }

    public static int raiseTenToPow(int pow) {

        return (int) Math.pow(10, pow);
    }

    public static void printList(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
        }
        emptyLine();
    }

    public static void emptyLine() {
        System.out.println();
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(double[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(boolean[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printThis(int a) {
        System.out.println(a);
    }

    public static void printThis(String a) {
        System.out.println(a);
    }

    public static void print2DArray(int[][] arr, int i, int j) {
        System.out.print(arr[i][j] + "     ");
    }

    public static void print2DArray(String[][] arr, int i, int j) {
        System.out.print(arr[i][j] + "  ");
    }
}
