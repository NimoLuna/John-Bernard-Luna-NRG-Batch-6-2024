import java.util.*;

public class Tasksheet116 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);

        ArrayList<Character> reversedList = new ArrayList<>();
        for (char c : input.toCharArray()) reversedList.add(0, c);

        System.out.println(input.equals(new StringBuilder(input).reverse().toString()) ? 
                           "The input string is a palindrome." : 
                           "The input string is not a palindrome.");
    }
}