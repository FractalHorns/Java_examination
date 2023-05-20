import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Notebook 1", 8, "Windows10", 80000, "HP"));
        set.add(new Notebook("Notebook 2", 16, "Windows10", 85000, "Acer"));
        set.add(new Notebook("Notebook 3", 32, "linux", 85000, "Lenovo"));
        set.add(new Notebook("Notebook 4", 32, "linux", 90000, "Asus"));

        OperationWithNotebook operation = new OperationWithNotebook(set);
        operation.start();

    }
}