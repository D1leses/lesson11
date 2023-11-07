import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        long arrayListTime = endTime - startTime;
        System.out.println("Время добавления элементов в ArrayList: " + arrayListTime + " мс");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            linkedList.add(i);
        }
        endTime = System.currentTimeMillis();
        long linkedListTime = endTime - startTime;
        System.out.println("Время добавления элементов в LinkedList: " + linkedListTime + " мс");

        double a = arrayListTime;
        double b = linkedListTime;
        double x = b-a;
        System.out.println("Разница между добавлениями ArrayList и LinkedList в " +x+ " мс");
    }

}