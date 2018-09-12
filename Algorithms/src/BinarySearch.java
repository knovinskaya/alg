import java.util.Scanner;

public class BinarySearch {
    private static  boolean binarySearch(int searchableValue) {
        int[] arr = {1, 4, 5, 8, 9, 10, 11, 24, 32, 45, 56, 57, 58, 60, 90, 97, 99};
        int result = -1, start = 0, end = arr.length;

        while (end - start > 1 && result < 0) {
            int position = (end - start) / 2 + start;
            if (arr[position] == searchableValue) {
                result = position;
            } else if (arr[position] > searchableValue) {
                end = position;
            } else {
                start = position;
            }
        }

        return result >= 0;
    }

    private static void userDialog() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the number from 1 to 100: ");
        int searchableValue = scanner.nextInt();

        if (searchableValue >= 1 && searchableValue <= 100) {
            if (binarySearch(searchableValue)) {
                System.out.println("Good work, your number in array");
            } else {
                System.out.println("Unfortunately, you did not guess right");
            }
        } else {
            System.out.println("Good try, but not today");
        }

        System.out.println("One more time? y/n");
        if (scanner.next().equals("y")) {
            userDialog();
        }
    }

    public static void main(String[] args) {
        userDialog();
    }
}
