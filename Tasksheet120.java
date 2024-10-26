public class Tasksheet120 {

    public static int calculateCumulativeSums(int... numbers) {
        int totalSum = 0;

        for (int number : numbers) {
            int cumulativeSum = 0;

            for (int i = 1; i <= number; i++) {
                cumulativeSum += i;
            }

            System.out.println("Cumulative sum for " + number + " is: " + cumulativeSum);
            totalSum += cumulativeSum;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int total = calculateCumulativeSums(4, 5, 10);
        System.out.println("Total sum of cumulative sums is: " + total);
    }
}
