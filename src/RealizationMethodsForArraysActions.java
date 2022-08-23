import static utils.Utils.*;

public class RealizationMethodsForArraysActions extends MethodsForArraysActions {

    public static void main (String[]args){

        // ~Task 1~

        printArray(
                getArrayFromRandomNumbers(getLength(5), 10, 100));

        printArray(
                getArrayFromRandomNumbers(getLength(-5), 10, 100));


        // ~Task 2~

        printArray(
                getArrayFromRandomNumbers(getLength(6), 11.98, 2.12));

        printArray(
                getArrayFromRandomNumbers(getLength(-6), 11.98, 2.12));

        // ~Task 3~

        printArray(
                getArrayFromString("One", "Two", "Three", "Four", "Five"));

        // ~Task 4~

        printArray(
                getArrayMultipliedNumbers(
                getArrayFromRandomNumbers(getLength(8), 999, 1), 2.5));

        printArray(
                getArrayMultipliedNumbers(
                getArrayFromRandomNumbers(getLength(-8), 999, 1),2.5));

        // ~Task 5~

        int[] arr = getArrayFromRandomNumbers(getLength(10), 99, 0);

        printArray(arr);

        printThis(countEvenNumbers(arr));

        printThis(countOddNumbers(arr));

        // ~Task 6.1~

        printArray(
                getArrayOddNumbers(
                getArrayFromRandomNumbers(getLength(5), 9999, 0)));

        // ~Task 6.2~

        printArray(
                getArrayEvenNumbers(
                getArrayFromRandomNumbers(getLength(5), 9999, 0)));

        // ~Task 7~

        printArray(
                getBooleanArray(
                getArrayFromRandomNumbers(10, 100, -10), 10)
        );

        // ~Task 8~

        printThis(
                getLineFromWords(new String[]{"Richard", "Of", "York", "Gave", "Battle", "In", "Vain"}));

        // ~Task 9~

        printThis(
                countSumHalfArray(
                getArrayFromRandomNumbers(12, 50, -50)));

        // ~Task 10~

        printArray(getMultiplicationTableOnNumber(1));

        printArray(getMultiplicationTableOnNumber(10));

        printArray(getMultiplicationTableOnNumber(11));

        printArray(getMultiplicationTableOnNumber(0));

        printArray(getMultiplicationTableOnNumber(-1));

        // ~Task 11~

        printArray(
                getArrayOfEvenOrOddNumbers(
                getArrayFromRandomNumbers(5, -100, 0)));

        printArray(
                getArrayOfEvenOrOddNumbers(
                getArrayFromRandomNumbers(5, 100, 0)));

        // ~Task 12~

        printArray(getArrayWithLength(15));

        printArray(getArrayWithLength(0));

        printArray(getArrayWithLength(-7));

        // ~Task 13~

        printArray(getArrayWithNumberDigits(5, 1));

        printArray(getArrayWithNumberDigits(5, 2));

        printArray(getArrayWithNumberDigits(5, 3));

        printArray(getArrayWithNumberDigits(5, 4));

        printArray(getArrayWithNumberDigits(5, 5));

        printArray(getArrayWithNumberDigits(5, 6));

        printArray(getArrayWithNumberDigits(5, 7));

        printArray(getArrayWithNumberDigits(5, 8));

        printArray(getArrayWithNumberDigits(5, 9));

        printArray(getArrayWithNumberDigits(5, 10));

        printArray(getArrayWithNumberDigits(5, 11));

        printArray(getArrayWithNumberDigits(5, -1));

        printArray(getArrayWithNumberDigits(-5, 11));

        printArray(getArrayWithNumberDigits(-5, -1));

        printArray(getArrayWithNumberDigits(0, 0));

        // ~Task 14~

        printArray(
                getArrayTwoDigitsNumber(
                getArrayFromRandomNumbers(getLength(10), 0, 150)));

        printArray(
                getArrayTwoDigitsNumber(
                getArrayFromRandomNumbers(getLength(-10), 0, 150)));

        printArray(
                getArrayTwoDigitsNumber(
                getArrayFromRandomNumbers(getLength(-10), 0, -100)));

        printArray(
                getArrayTwoDigitsNumber(
                getArrayFromRandomNumbers(getLength(0), 0, -100)));

        // ~Task 15~

        printArray(
                getArrayOfDifferences(
                getArrayFromRandomNumbers(getLength(5), 99, 10)));

        printArray(
                getArrayOfDifferences(
                getArrayFromRandomNumbers(getLength(-5), 99, 10)));

        printArray(
                getArrayOfDifferences(
                getArrayFromRandomNumbers(getLength(5), 101, 100)));
    }
}