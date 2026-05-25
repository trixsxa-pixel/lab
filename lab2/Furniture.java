public abstract class Furniture {
    private String name;
    private String material;
    private double price;

    private static int objectCount = 0;

    public Furniture() {
        this("Неизвестная мебель", "Дерево", 0.0);
    }

    public Furniture(String name, String material, double price) {
        this.name = name;
        this.material = material;
        this.price = price;
        objectCount++;
    }

    public abstract void assemble();

    public void displayInfo() {
        System.out.println("Наименование: " + name + ", Материал: " + material + ", Цена: " + price + " руб.");
    }

    public static int getObjectCount() {
        return objectCount;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}