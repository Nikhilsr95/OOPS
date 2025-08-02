import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name of Student: ");
        String name = sc.nextLine();  

        System.out.print("Enter Rollno of Student: ");
        int roll = 0;
        try {
            roll = Integer.parseInt(sc.nextLine()); 
           } catch (NumberFormatException e) {
            System.out.println("Invalid roll number. Please enter an integer.");
            return;
        }

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);

        sc.close();
    }
}
