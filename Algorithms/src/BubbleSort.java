public class BubbleSort {
    private static void printArray(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int [] bubbleSort(int[] arr) {
        int counter;

        for (int j = 1; j < arr.length; j++) {
            counter = 0;

            for (int i = 0; i < arr.length - 1; i++) {
                int a = arr[i];
                int b = arr[i + 1];

                if (a > b) {
                    counter++;
                    a += b;
                    b = a - b;
                    arr[i] = a - b;
                    arr[i + 1] = b;
                }
            }

            if (counter == 0) {
                break;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int [] arr = { 79, 34, 66, 22, 11, 21, 45, 99, 32, 34, 54, 76, 87, 86, 92, 1, 2, 4 };

        System.out.println("Original array");
        printArray(arr);

        System.out.println("Sorted array");
        printArray(bubbleSort(arr));
    }
}
