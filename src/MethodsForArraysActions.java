import java.util.Arrays;

import static utils.Utils.*;

public class MethodsForArraysActions {

    /*
    ~Task 1~
    Write a method returning an array
    from the positive or negative integers
    */

    public static int[] getArrayFromRandomNumbers(int length, int upNum, int lowNum) {
        int[] arr = new int[length];

        if(length > 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = getRandomNumberInInterval(upNum, lowNum);
            }

            return arr;
        } else {

            return new int[]{};
        }
    }

    /*
    ~Task 2~
    Write a method returning an array
    from the positive or negative doubles.
    Method overloading
    */

    public static double[] getArrayFromRandomNumbers(int length, double upNum, double lowNum) {
        double[] arr = new double[length];

        if(length > 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = getRandomNumberInInterval(upNum, lowNum);
            }

            return arr;
        } else {

            return new double[]{};
        }
    }

    /*
    ~Task 3~
    Write a method accepting the input
    5 words, and returns an array
    from the same words
    */

    public static String[] getArrayFromString(String s1, String s2, String s3, String s4, String s5) {
        String[] arr;

        if (s1 != null && s2 != null && s3 != null && s4 != null && s5 != null) {
            arr = new String[]{s1, s2, s3, s4, s5};
        }
        else {
            arr = new String[]{};
        }

        return arr;
    }

    /*
    ~Task 4~
    Write a method accepting the input array
    of positive or negative integers, and returns an array
    the same numbers, multiplied by set double
    */

    public static double[] getArrayMultipliedNumbers(int[] arr, double multiplier) {
        double[] arrD = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr.length != 0) {
                arrD[i] = arr[i] * multiplier;
            }
            else {
                arrD = new double[]{};
            }
        }

        return arrD;
    }

    /*
    ~Task 5~
    Write two methods accepting the input array
    of positive integers, and returns the quantity
    even and odd numbers in this array
    */

    public static int countEvenNumbers(int[] arr) {
        if(!containsNegativeNumbers(arr) && arr.length != 0) {
            int counter = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0  && arr[i] > 0) {
                    counter++;
                }
            }
            return counter;
        }

        return Integer.MIN_VALUE;
    }

    public static int countOddNumbers(int[] arr) {
        if(!containsNegativeNumbers(arr) && arr.length != 0) {
            int counter = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0  && arr[i] > 0) {
                    counter++;
                }
            }
            return counter;
        }

        return Integer.MAX_VALUE;
    }

    /*
    ~Task 6.1~
    Write a method accepting the input array
    of positive integers, and returns
    the array odd numbers
    */

    public static int[] getArrayOddNumbers(int[] arr) {
        int lengthOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr.length != 0 && arr[i] % 2 != 0 && !containsNegativeNumbers(arr)) {
                lengthOdd++;
            }
        }

        int[] arrayOdd = new int[lengthOdd];
        int countOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && lengthOdd != 0) {
                arrayOdd[countOdd] = arr[i];
                countOdd++;
            }
        }

        return arrayOdd;
    }

    /*
    ~Task 6.2~
    Write a method accepting the input array
    of positive integers, and returns
    the array even numbers
    */

    public static int[] getArrayEvenNumbers(int[] arr) {
        int lengthEven = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr.length != 0 && arr[i] % 2 == 0 && !containsNegativeNumbers(arr)) {
                lengthEven++;
            }
        }

        int[] arrayEven = new int[lengthEven];
        int countEven = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && lengthEven != 0) {
                arrayEven[countEven] = arr[i];
                countEven++;
            }
        }

        return arrayEven;
    }

    /*
    ~Task 7~
    Write a method accepting the input array of integers,
    and returns an array values true or false,
    if the numbers are greater than condition number
    */

    public static boolean[] getBooleanArray(int[] arr, int condition) {
        int newLength = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr.length != 0)
                newLength++;
        }

        boolean[] greaterThan_10 = new boolean[newLength];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > condition) {
                greaterThan_10[count] = true;
                count++;
            }
            else if (arr[i] < condition) {
                greaterThan_10[count] = false;
                count++;
            }
        }

        return greaterThan_10;
    }

    /*
    ~Task 8~
    Write a method, accepting the input
    array of words,and returns
    the string of these words
    */

    public static String getLineFromWords(String[] arr) {
        String wordsLine = "";

        if (arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                wordsLine = wordsLine + arr[i] + " ";
            }
        }

        return wordsLine;
    }

    /*
    ~Task 9~
    Write a method, accepting the input
    array of integers,and counts the sum of the numbers
    in the second half of the array
    */

    public static int countSumHalfArray(int[] arr) {
        int newLength = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr.length != 0 && arr.length % 2 == 0) {
                newLength = arr.length - arr.length / 2;
            } else if (arr.length % 2 != 0) {
                newLength = arr.length - ((arr.length + 1) / 2);
            }
        }

        int[] newArr = Arrays.copyOfRange(arr, newLength, arr.length);

        for (int i = 0; i < newArr.length; i++) {
            sum = sum + newArr[i];
        }

        return sum;
    }

    /*
    ~Task 10~
    Write a method, accepting the input
    positive integer within (1, 10),
    and returns multiplication table
    on this number as an array
    For example,
    method(2) ->{0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
    */

    public static int[] getMultiplicationTableOnNumber(int x) {
        int length = 0;
        String error = "You entered a number not from the interval (1, 10)";

        for (int i = 0; i < 11; i++) {
            length++;
        }

        int[] arr = new int[length];
        int number = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = number;
            number++;
        }

        if(x > 0 && x < 11) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] * x;
            }
        } else {
            arr = new int[]{};
            printThis(error);
        }

        return arr;
    }

    /*
    ~Task 11~
    Write a method, accepting an array
    integers and returns array of even numbers,
    if there are more even numbers,
    or an array of odd numbers,
    if there are more odd numbers
    */

    public static int[] getArrayOfEvenOrOddNumbers(int[] arr) {
        final String EVEN_MORE = "Even numbers more";
        final String ODD_MORE = "Odd numbers more";
        final String EQUAlS_OR_ZEROS = "Even equals odd or array values are zeros";

        int lengthEven = 0;
        int lengthOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr.length != 0) {
                if (arr[i] % 2 == 0) {
                    lengthEven++;
                }
                else if (arr[i] % 2 != 0) {
                    lengthOdd++;
                }
            }
        }

        int[] arrEven = new int[lengthEven];
        int[] arrOdd = new int[lengthOdd];

        int indexEven = 0;
        int indexOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && indexEven < arrEven.length) {
                arrEven[indexEven] = arr[i];
                indexEven++;
            }
            else if (arr[i] % 2 != 0 && indexOdd < arrOdd.length) {
                arrOdd[indexOdd] = arr[i];
                indexOdd++;
            }
        }

        int[] needArr = new int[]{};

        if (lengthEven > lengthOdd) {
            needArr = Arrays.copyOf(arrEven, lengthEven);
            printThis(EVEN_MORE);
        }
        else if(lengthEven < lengthOdd) {
            needArr = Arrays.copyOf(arrOdd, lengthOdd);
            printThis(ODD_MORE);
        }
        else if (lengthEven == lengthOdd) {
            printThis(EQUAlS_OR_ZEROS);
        }

        return needArr;
    }

    /*
    ~Task 12~
    Write a method, accepting the input
    the length of the array and generates
    array of random positive numbers [0, 10]
    */

    public static int[] getArrayWithLength(int length) {
        int[] arr = new int[getLength(length)];

        if (length != 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = getRandomNumberInInterval(10, 0);
            }

            return arr;
        } else {

            return new int[]{};
        }
    }

    /*
    ~Task 13~
    Write a method, accepting the input
    the length of the array and the quantity of characters
    (one-digit, double-digit, three-digit numbers, etc.),
    and generates an array random integers positive numbers
    of this length and all numbers have this quantity of characters
    */

    public static int[] getArrayWithNumberDigits(int length, int digit) {
        final String ERROR = "Error, you entered zero";
        final String NOT_POSSIBLE = "It's not possible to exceed the type Integer range";
        final String NEGATIVE = "You have entered a negative number of digits";
        final String ZERO = "You entered the array length = zero";

        int[] arr = new int[getLength(length)];

        if (length != 0) {
            if (digit == 0) {
                printThis(ERROR);
                arr = new int[]{};
            }
            else if (digit == 1) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = getRandomWithBorder(raiseTenToPow(digit));
                }
            }
            else if (digit == 2) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = getRandomWithBorder(raiseTenToPow(digit));
                }
            }
            else if (digit == 3) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = getRandomWithBorder(raiseTenToPow(digit));
                }
            }
            else if (digit == 4) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = getRandomWithBorder(raiseTenToPow(digit));
                }
            }
            else if (digit == 5) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = getRandomWithBorder(raiseTenToPow(digit));
                }
            }
            else if (digit == 6) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = getRandomWithBorder(raiseTenToPow(digit));
                }
            }
            else if (digit == 7) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = getRandomWithBorder(raiseTenToPow(digit));
                }
            }
            else if (digit == 8) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = getRandomWithBorder(raiseTenToPow(digit));
                }
            }
            else if (digit == 9) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = getRandomWithBorder(raiseTenToPow(digit));
                }
            }
            else if (digit == 10) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = getRandomWithBorder(Integer.MAX_VALUE);
                }
            }
            else if (digit > 10 && digit < Integer.MAX_VALUE ) {
                printThis(NOT_POSSIBLE);
                arr = new int[]{};
            }
            else if (digit < 0 && digit > Integer.MIN_VALUE ) {
                printThis(NEGATIVE);
                arr = new int[]{};
            }
    } else {
            printThis(ZERO);
            arr = new int[]{};
    }

        return arr;
    }

    /*
    ~Task 14~
    Write a method, accepting the input
    array of positive integers,
    and returns an array
    only two-digit numbers
    */

    public static int getLengthForArrayNeedDigitPositiveNumbers(int[] arr, int low, int high) {
        int lengthNew = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr.length != 0 && arr[i] > 0 && arr[i] > low && arr[i] < high) {
                lengthNew++;
            }
        }

        return lengthNew;
    }

    public static int[] getArrayTwoDigitsNumber(int[] arr) {
        int[] arrNew = new int[getLengthForArrayNeedDigitPositiveNumbers(arr, 9, 100)];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (index < arrNew.length && arr[i] > 0) {
                if (arr[i] > 9 && arr[i] < 100) {
                    arrNew[index] = arr[i];
                    index++;
                }
            } else {
                arrNew = new int[]{};
            }
        }

        return arrNew;
    }

    /*
    ~Task 15~
    Write a method, accepting the input
    array of positive integers two-digit numbers,
    and returns an array of differences
    between tens and ones
    */

    public static int[] getArrayOfDifferences(int[] arr) {
        int[] newArr = new int[getLengthForArrayNeedDigitPositiveNumbers(arr, 9, 100)];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (index < newArr.length && arr[i] > 0) {
                if (arr[i] > 9 && arr[i] < 100) {
                    newArr[index] = (arr[i] / 10) - (arr[i] % 10);
                    index++;
                }
            } else {
                newArr = new int[]{};
            }
        }

        return newArr;
    }

    public static void main(String[] args) {
        printArray(
                getArrayFromString("One", "Two", "Three", "Four", "Five"));
    }
}