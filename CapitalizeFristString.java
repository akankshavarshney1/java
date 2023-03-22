import java.util.*;
public  class CapitalizeFristString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = sc.nextLine();

        // Split the string into words
        String[] words = string.split(" ");

        // Capitalize the first letter of each word
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        String capitalizedString = sb.toString().trim();

        // Print the capitalized string
        System.out.println("Capitalized String: " + capitalizedString);
    }
}

