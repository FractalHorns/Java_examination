import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Notebook {

    String name; // с 10 по 15 строку инициализируем экземплярам класса Notebook параметры
    private int amountRAM;
    private String operatingSystem;
    private int price;
    private String model;
    private String color;

    public Notebook(String name, int amountRAM, String operatingSystem, int price, String model, String color) {  // добавляем экземплярам класса Notebook параметры
        this.name = name;
        this.amountRAM = amountRAM;
        this.operatingSystem = operatingSystem;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public boolean validateObject(){
        return true;
    }

    public static List<String> propertiesForFilter(){
        List<String> list = new ArrayList<>();
        list.add("amountRAM");
        list.add("operatingSystem");
        list.add("price");
        list.add("model");
        list.add("color");

        return list;

    }

    @Override
    public String toString() {
        return "Ноутбук: (" + name + "): " +
                "количество опретивной памяти:" + amountRAM +
                ", операционная система: " + operatingSystem + '\'' +
                ", цена: " + price +
                ", модель: " + model +
                ", цвет: " + color;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountRAM() {
        return amountRAM;
    }

    public void setAmountRAM(int amountRAM) {
        this.amountRAM = amountRAM;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void sort(Set<Notebook> notebooks) {
    }
    /*@Override
    public int compareTo(Notebook notebook) {
        return (this.id - notebook.id);
    }
    @Override
    public String toString() {
        return "[name=" + this.name + ", amountRAM=" + this.amountRAM + ", operatingSystem=" + this.operatingSystem + ", price=" + this.price + "color=" + this.color + "]";
    }*/
}
