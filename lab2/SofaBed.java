public class SofaBed extends Bed {
    private boolean hasUpholstery;

    public SofaBed() {
        super("Диван-кровать Люкс", "Ткань/Дерево", 25000, "Двуспальная");
        this.hasUpholstery = true;
    }

    public SofaBed(String name, String material, double price, String size,
                   boolean hasUpholstery) {
        super(name, material, price, size);
        this.hasUpholstery = hasUpholstery;
    }

    @Override
    public void assemble() {
        super.assemble();
    }
    public void transform() {
        System.out.println("Диван успешно трансформирован в спальное место размера " + getSize());
    }

    public boolean isHasUpholstery() { return hasUpholstery; }
    public void setHasUpholstery(boolean hasUpholstery) { this.hasUpholstery = hasUpholstery; }
}