public class Chair extends Furniture {
    private boolean hasBackrest;

    public Chair() {
        super("Базовый стул", "Пластик", 1500);
        this.hasBackrest = true;
    }

    public Chair(String name, String material, double price, boolean hasBackrest) {
        super(name, material, price);
        this.hasBackrest = hasBackrest;
    }

    @Override
    public void assemble() {
        System.out.println("Сборка стула " + (hasBackrest ? "с спинкой." : "без спинки."));
    }

    public boolean isHasBackrest() { return hasBackrest; }
    public void setHasBackrest(boolean hasBackrest) { this.hasBackrest = hasBackrest; }
}