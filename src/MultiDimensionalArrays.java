import static Utils.Utils.*;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        /*
        ~Task 1~
        Create a two-dimensional array
        random integers in between [100, 999]
        dimensions 5*10
        */

        int[][] twoDimArray = new int[5][10];

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = getRandomNumber(999, 100);
            }
        }

        for (int i = 0; i < twoDimArray.length; i++) {
            emptyLine();
            for (int j = 0; j < twoDimArray[i].length; j++) {
                print2DArray(twoDimArray, i, j);
            }
        }

        /*
        ~Task 2~
        Find the amount all even numbers
        of the array from task 1
        */

        int sum = 0;

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (twoDimArray[i][j] % 2 == 0) {
                    sum += twoDimArray[i][j];
                }
            }
        }

        printThis(sum);

        /*
        ~Task 3~
        Create a two-dimensional array
        with the properties
        of Java primitive data types
        */

        final String b = " bit";

        String[] dataType =
                {"byte", "short", "int", "long", "float", "double", "char","boolean"};

        String[] defaultVal =
                {"0", "0", "0", "0L", "0.0F", "0.0", "0", "false"};

        String[] memoryCap =
                {
                "8".concat(b), "16".concat(b), "32".concat(b), "64".concat(b),
                "32".concat(b), "64".concat(b), "16".concat(b), "~1".concat(b)
                };

        String[][] primitives = new String[8][3];

        for (int i = 0; i < primitives.length; i++) {
            for (int j = 0; j < primitives[i].length; j++) {
                if (j == 0 && dataType.length != 0) {
                    primitives[i][j] = dataType[i];
                }
                else if (j == 1) {
                    primitives [i][j] = defaultVal[i];
                }
                else if (j == 2) {
                    primitives[i][j] = memoryCap[i];
                }
            }
        }

        for (int i = 0; i < primitives.length; i++) {
            emptyLine();
            for (int j = 0; j < primitives[i].length; j++) {
                print2DArray(primitives, i, j);
            }
        }
    }
}
