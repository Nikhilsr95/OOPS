import java.util.Scanner;
import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1 == s2);   
        System.out.println(s1 == s3);   
        System.out.println(s1.equals(s3));  

        String original = "Java";
        String modified = original + " Programming";
        System.out.println(original);
        System.out.println(modified);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        System.out.println("Original array:");
        for (String word : words) {
            System.out.print(word + " ");
        }

        Arrays.sort(words);
        System.out.println("\nSorted array:");
        for (String word : words) {
            System.out.print(word + " ");
        }

        System.out.println("\nReversed array:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

        String concatenatedString = "";
        for (String word : words) {
            concatenatedString += word + " ";
        }
        System.out.println("\nConcatenated String: " + concatenatedString.trim());

        sc.close();
    }
}
