import java.util.ArrayList;

class StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");

        students.add(1, "David");

        students.remove("Bob");

        String checkName = "Alice";
        if (students.contains(checkName)) {
            System.out.println(checkName + " is present in the list.");
        } else {
            System.out.println(checkName + " is not present in the list.");
        }

        System.out.println("Total number of students: " + students.size());
        System.out.println("Final Student List: " + students);
    }
}
