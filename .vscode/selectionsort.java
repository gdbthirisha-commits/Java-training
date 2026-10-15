//  selectionSort Array Elements in Ascending Order

public class selectionsort {
    public static void main(String[] args) {

        int[] numbers = {5, 3, 8, 1, 2};

        for (int i = 0; i < numbers.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }

        System.out.println("Sorted array:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}



