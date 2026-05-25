public class ComputerTable extends Table {
    private String cableManagement;

    public ComputerTable() {
        super("Игровой стол", "МДФ", 9000, "Прямоугольный");
        this.cableManagement = "Отверстие в столешнице";
    }

    public ComputerTable(String name, String material, double price, String shape, String cableManagement) {
        super(name, material, price, shape);
        this.cableManagement = cableManagement;
    }

    @Override
    public void assemble() {
        super.assemble();
    }
    public void setupTech() {
        System.out.println("Компьютерный стол готов к установке ПК. Кабель-менеджмент: " + cableManagement);
    }

    public String getCableManagement() { return cableManagement; }
    public void setCableManagement(String cableManagement) { this.cableManagement = cableManagement; }
}