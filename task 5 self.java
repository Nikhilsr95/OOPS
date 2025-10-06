import java.util.ArrayList;

class InventoryManager {
    public static void main(String[] args) {
        ArrayList<Integer> quantities = new ArrayList<>();

        quantities.add(10);
        quantities.add(20);
        quantities.add(15);
        quantities.add(30);

        quantities.set(2, 25);

        int total = 0;
        for (int qty : quantities) {
            total += qty;
        }

        System.out.println(quantities);
        System.out.println(total);

        quantities.clear();
        System.out.println(quantities);
    }
}
