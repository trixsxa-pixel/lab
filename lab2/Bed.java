public class Bed extends Furniture {
    private String size;

    public Bed() {
        super("Стандартная кровать", "Дерево", 12000);
        this.size = "Двуспальная";
    }

    public Bed(String name, String material, double price, String size) {
        super(name, material, price);
        this.size = size;
    }

    @Override
    public void assemble() {
        System.out.println("Сборка кровати размера " + size);
    }

    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }
}