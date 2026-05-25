public class OfficeChair extends Chair {
    private boolean hasGasLift;

    public OfficeChair() {
        super("Офисный стул", "Ткань/Пластик", 5000, true);
        this.hasGasLift = true;
    }

    public OfficeChair(String name, String material, double price, boolean hasBackrest, boolean hasGasLift) {
        super(name, material, price, hasBackrest);
        this.hasGasLift = hasGasLift;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Дополнительно: Устанавливаем подъемный механизм.");
    }

    public boolean isHasGasLift() { return hasGasLift; }
    public void setHasGasLift(boolean hasGasLift) { this.hasGasLift = hasGasLift; }
}