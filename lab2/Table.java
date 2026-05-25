public class Table extends Furniture {
    private String shape;

    public Table() {
        super("Стандартный стол", "ДСП", 3000);
        this.shape = "Прямоугольный";
    }

    public Table(String name, String material, double price, String shape) {
        super(name, material, price);
        this.shape = shape;
    }

    @Override
    public void assemble() {
        System.out.println("Сборка стола определенной формы: '" + shape + "'.");
    }

    public void displayInfo(boolean showShape) {
        super.displayInfo();
        if (showShape) {
            System.out.println("-> Форма столешницы: " + shape);
        }
    }

    public String getShape() { return shape; }
    public void setShape(String shape) { this.shape = shape; }
}