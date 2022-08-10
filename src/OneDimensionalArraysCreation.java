import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OneDimensionalArraysCreation {

    private static int getCount(int start, int end, int step) {
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

    private static int getCountOfOddNums(int start, int end, int step) {
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

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    private static void printList(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
        }
        System.out.println();
    }

    private static int getRandomNumber(int end, int start) {

        return (int) (Math.random() * end + start);
    }

    private static int getAverage(int[] arr) {
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

    private static void printThis(int a) {
        System.out.println(a);
    }

    private static int getMin(int[] arr) {
        Arrays.sort(arr);

        return  arr[0];
    }

    private static int getMax(int[] arr) {
        Arrays.sort(arr);

        return arr[arr.length - 1];
    }

    public static void main (String[] args) {

        /*
        ~Task 1~
        Create an array even positive numbers,
        the values of which are not more than 10
        */

        int[] evenNumbers = new int[getCount(0, 11, 2)];

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

        int[] oddNumbers = new int[getCount(1, 16, 2)];
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

        int[] randomNums = new int[getCount(5, 20, 1)];

        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = getRandomNumber(20, 5);
        }

        printArray(randomNums);
        printThis(getAverage(randomNums));

        /*
        ~Task 5~
        Create an array odd negative numbers
        in between (-1000, -900)
        */

        int[] array = new int[getCountOfOddNums(-1000, -900, 1)];

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
            randomList.add(getRandomNumber(10000, 0));
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
