import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Notebook 1", 8, "Windows10", 80000, "HP", "черный"));
        set.add(new Notebook("Notebook 2", 16, "Windows10", 85000, "Acer", "белый"));
        set.add(new Notebook("Notebook 3", 32, "linux", 85000, "Lenovo", "белый"));
        set.add(new Notebook("Notebook 4", 32, "linux", 90000, "Asus", "синий"));
        set.add(new Notebook("Notebook 5", 16, "Windows10", 100000, "MSI", "красный"));



        OperationWithNotebook operation = new OperationWithNotebook(set);
        operation.start();
        
        

    }
}