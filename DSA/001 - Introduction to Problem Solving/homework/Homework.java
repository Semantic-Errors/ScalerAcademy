import java.util.ArrayList;

class Homework {
    public static void main(String[] args) {
        Homework homework = new Homework();

        int[] input = { 1, 2, 3 };
        System.out.println(homework.countElements(input)); 

        int patternSize = 4;
        int[][] pattern = homework.getPattern(patternSize);
        homework.printPattern(pattern);

        input = new int[]{ 0, 2, 9 };
        System.out.println(homework.minimumPicks(input));
        input = new int[]{ 5, 17, 100, 1 };
        System.out.println(homework.minimumPicks(input));


        input = new int[] { 1, 2, 3, 4, 5 };
        printArrayList_I(homework.elementHasAtLeastTwoGreater(input));

        input = new int[] { 11, 17, 100, 5 };
        printArrayList_I(homework.elementHasAtLeastTwoGreater(input));
    }

    // Smaller and Greater Problem
    public int countElements(int[] nums) {
        int count = 0;
        int smallestElement = Integer.MAX_VALUE;
        int greatestElement = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (smallestElement > nums[i])
                smallestElement = nums[i];
            
            if (greatestElement < nums[i])
                greatestElement = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (smallestElement < nums[i] && nums[i] < greatestElement)
                ++count;
        }

        return count;
    }

    // Pattern Printing Problem
    public int[][] getPattern(int size) {
        int[][] pattern = new int[size][size];

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                pattern[row-1][col-1] = (col <= row) ? col : 0;
            }
        }

        return pattern;
    }

    public void printPattern(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Minimum Picks Problem
    public int minimumPicks(int[] nums) {
        int minOddNumber = Integer.MAX_VALUE;  //2147483647 it;s odd
        int maxEvenNumber = Integer.MIN_VALUE; //-2147483648 it's even

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                if (nums[i] > maxEvenNumber)
                    maxEvenNumber = nums[i];
            }
            else {
                if (nums[i] < minOddNumber)
                    minOddNumber = nums[i];
            }
        }

        return (maxEvenNumber - minOddNumber);
    }

    // Elements Which has At Least Two Greater Problem
    public ArrayList<Integer> elementHasAtLeastTwoGreater(int[] nums) {
        int greatestElement = Integer.MIN_VALUE;
        int secondGreatestElement = Integer.MIN_VALUE + 1;

        ArrayList<Integer> elements = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > greatestElement) {
                secondGreatestElement = greatestElement;
                greatestElement = nums[i];
            }
            else {
                if (nums[i] > secondGreatestElement)
                    secondGreatestElement = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < secondGreatestElement) {
                elements.add(nums[i]);
            }
        }

        return elements;
    }

    // Helper Functions
    public static void printArrayList_I(ArrayList<Integer> nums) {
        for (Integer num : nums)
            System.out.print(num + " ");
        System.out.println();
    }
}
