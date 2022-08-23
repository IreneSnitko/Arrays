import static utils.Utils.*;

public class RealizationArraysAlgorithms extends ArraysAlgorithms {

    public static void main(String[] args) {

//  ~Task 1~ odd indices

        printArray(
                getOddIndices(
                new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}));

        printArray(getOddIndices(new int[]{}));

//  ~Task 2~ sum array

        printThis(
                getSumArray(
                new int[]{-45, 590, 234, 985, 12, 68}));

        printThis(
                getSumArray(new int[]{-7, -3}));

//  ~Task 3~ min & max & ave

        printArray(
                getMinMaxAve(
                new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 3, 6));

//  ~Task 4~ peak elements

        printArray(
                getPeakElementsArray(
                new int[]{3, 2, 7, 5, 1, 9, 23, 1}));

        printArray(
                getPeakElementsArray(new int[]{}));

//  ~Task 5~ intersection

        printArray(
                getArrayIntersection(
                new int[]{0, 1, 33, 44, 54, 64, 74, 84, 116, 145},
                new int[]{33, 48, 54, 61, 74, 88}));

        printArray(
                getArrayIntersection(
                new int[]{},
                new int[]{33, 48, 54, 61, 74, 88}));

        printArray(
                getArrayIntersection(
                new int[]{0, 1, 2, 3, 4},
                new int[]{5, 6, 7, 8, 9}));

//  ~Task 6~ reverse array

        printArray(
                getReverseArray(new int[]{0, 1, 2, 3, 4, 5, 6}));

        printArray(
                getReverseArrayWitCounterDecreasing(
                new int[]{99, 88, 77, 66, 55, 44, 33, 22, 11}));

//  ~Task 7~ sort array

        printArray(
                getSortedArray(
                new int[]{112, 1, 6, -7, 55, 120, -33, 22, 19}));

//  ~Task 8~ negative on the right

        printArray(
                getNegativeOnTheRight(
                new int[]{4, -3, 7, -12, 5, -2, 9, 4, 12}));
    }
}
