import java.util.ArrayList;
import java.util.Collections;

class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Finish assignment");
        tasks.add("Buy groceries");
        tasks.add("Call friend");
        tasks.add("Attend meeting");

        tasks.remove("Buy groceries");

        Collections.sort(tasks);

        String task = tasks.get(1);
        System.out.println(task);

        System.out.println(tasks.isEmpty());
        System.out.println(tasks);
    }
}






