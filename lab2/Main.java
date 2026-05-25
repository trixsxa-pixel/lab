public class Main {
    public static void main(String[] args) {
        System.out.println("Начальное количество мебели в базе: " + Furniture.getObjectCount());

        Table diningTable = new Table("Обеденный стол", "Дуб", 15000, "Круглый");
        Chair simpleChair = new Chair("Табурет", "Сосна", 6000, false);
        Bed regularBed = new Bed();

        ComputerTable gamingTable = new ComputerTable("Игровой стол", "Сталь/дерево", 24000, "прямоугольный-изогнутый",  "Скрытый кабель-канал");
        OfficeChair officeChair = new OfficeChair("Кресло игровое", "Ткань-сетка", 19000, true, true);
        SofaBed smartSofa = new SofaBed("Диван-трансформер", "кожа", 145000, "двуспальный", true);

        System.out.println("Итоговое количество созданной мебели: " + Furniture.getObjectCount());

        System.out.println("------------------------------------------------------------------");
        diningTable.displayInfo(true);
        diningTable.assemble();
        System.out.println();

        gamingTable.displayInfo();
        gamingTable.assemble();
        gamingTable.setupTech();
        System.out.println("------------------------------------------------------------------");

        simpleChair.displayInfo();
        simpleChair.assemble();
        System.out.println();

        officeChair.displayInfo();
        officeChair.assemble();
        System.out.println("------------------------------------------------------------------");

        regularBed.displayInfo();
        regularBed.assemble();
        System.out.println();

        smartSofa.displayInfo();
        smartSofa.assemble();
        smartSofa.transform();
    }
}