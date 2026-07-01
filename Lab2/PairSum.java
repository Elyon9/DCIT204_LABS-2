import java.util.Scanner;

public class PairSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        while (size <= 1) {
            System.out.print("The array size must be at least 2 to form a pair. Please enter again: ");
            size = scanner.nextInt();
        }

        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the Target Sum: ");
        int target = scanner.nextInt();

        boolean pairFound = false;
        int firstIndex = -1, secondIndex = -1;

        for (int i = 0; i < numbers.length && !pairFound; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    firstIndex = i;
                    secondIndex = j;
                    pairFound = true;
                    break;
                }
            }
        }

        System.out.println("\nRESULTS");
        if (pairFound) {
            int valueA = numbers[firstIndex];
            int valueB = numbers[secondIndex];
            System.out.println("Pair found at;");
            System.out.println("Index 1 : " + firstIndex + " (value = " + valueA + ")");
            System.out.println("Index 2 : " + secondIndex + " (value = " + valueB + ")");
            System.out.println("Equation : " + valueA + " + " + valueB + " = " + target);
        } else {
            System.out.println("No pair was found that adds up to " + target + ".");
        }
        scanner.close();
    }
}