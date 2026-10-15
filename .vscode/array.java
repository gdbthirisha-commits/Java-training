// Find Minimum, Sum, and Average: (Array Elements)

public class array {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 5, 30, 15};

        int sum = 0;
        int min = numbers[0];

        for (int number : numbers) {

            sum = sum + number;

            if (number < min) {
                min = number;
            }
        }

        double average = (double) sum / numbers.length;

        System.out.println("Minimum: " + min);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
    

