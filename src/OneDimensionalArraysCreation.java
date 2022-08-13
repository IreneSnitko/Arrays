import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Utils.Utils.*;

public class OneDimensionalArraysCreation {

    public static void main (String[] args) {

        /*
        ~Task 1~
        Create an array even positive numbers,
        the values of which are not more than 10
        */

        int[] evenNumbers = new int[getArrayLengthWithConditions(0, 11, 2)];

        for (int i = 0, j = 0; i < 11; i++) {

            if (i % 2 == 0 && j < evenNumbers.length) {
                evenNumbers[j] = i;
                j++;
            }
        }

        printArray(evenNumbers);

        /*
        ~Task 2~
        Create an array odd positive numbers,
        the values of which are not more than 15,
        transform this array to list
        */

        int[] oddNumbers = new int[getArrayLengthWithConditions(1, 16, 2)];
        int val = 1;

        for (int i = 0; i < oddNumbers.length; i++) {
            oddNumbers[i] = val;
            val += 2;
        }

        printArray(oddNumbers);

        Integer[] oddNumbers2 = new Integer[oddNumbers.length];

        for (int i = 0; i < oddNumbers.length; i++) {
            oddNumbers2[i] = oddNumbers[i];
        }

        List<Integer> list = Arrays.asList(oddNumbers2);
        printList(list);

        /*
        ~Task 3~
        Create a list positive numbers multiples of 5,
        the values of which in between [110, 150],
        transform this list to array
        */

        List<Integer> listNums = new ArrayList<>();

        for (int i = 110; i < 151; i++) {
            if (i % 5 == 0) {
                listNums.add(i);
            }
        }

        printList(listNums);

        int[] arrayNums = new int[listNums.size()];

        for (int i = 0; i < listNums.size(); i++) {
            arrayNums[i] = listNums.get(i);
        }

        printArray(arrayNums);

        /*
        ~Task 4~
        Create an array random integers
        in between [5, 20],
        find the average value
        */

        int[] randomNums = new int[getArrayLengthWithConditions(5, 20, 1)];

        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = getRandomNumberInInterval(20, 5);
        }

        printArray(randomNums);
        printThis(getAverage(randomNums));

        /*
        ~Task 5~
        Create an array odd negative numbers
        in between (-1000, -900)
        */

        int[] array = new int[getArrayLengthOfOddNums(-1000, -900, 1)];

        for (int i = 0, j = -1000; j < -900; j++) {
            if (j % 2 != 0) {
                if (i < array.length) {
                    array[i] = j;
                    i++;
                }
            }
        }

        printArray(array);

        /*
        ~Task 5~
        Create an array[15] random numbers
        in between [0, 10000],
        find the average value,
        maximum and minimum
        */

        List<Integer> randomList = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            randomList.add(getRandomNumberInInterval(10000, 0));
        }

        printList(randomList);

        int[] randomArr = new int[randomList.size()];

        for (int i = 0; i < randomList.size(); i++) {
            randomArr[i] = randomList.get(i);
        }

        printArray(randomArr);

        printThis(getAverage(randomArr));
        printThis(getMin(randomArr));
        printThis(getMax(randomArr));

        /*
       ~Task 6~
       Create an array of even numbers
       and an array of odd numbers
       from array elements from the task 5
        */

        int lengthOdd = 0;
        int lengthEven = 0;

        for (int i = 0; i < randomArr.length; i++) {
            if (randomArr[i] % 2 == 0) {
                lengthEven++;
            }
            else {
                lengthOdd++;
            }
        }

        int[] oddNums = new int[lengthOdd];
        int indexOdd = 0;

        int[] evenNums = new int[lengthEven];
        int indexEven = 0;

        for (int i = 0; i < randomArr.length; i++) {

            if (randomArr[i] % 2 == 0 && indexEven < randomArr.length) {
                evenNums[indexEven] = randomArr[i];
                indexEven++;
            }
            else if (randomArr[i] % 2 != 0 && indexEven < randomArr.length) {
                oddNums[indexOdd] = randomArr[i];
                indexOdd++;
            }
        }

        printArray(oddNums);
        printArray(evenNums);
    }
}