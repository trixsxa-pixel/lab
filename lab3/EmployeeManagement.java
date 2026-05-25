import java.util.HashMap;

class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник: " + name + " | Должность: " + position + " | Зарплата: " + salary;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        HashMap<Integer, Employee> employeeMap = new HashMap<>();

        employeeMap.put(101, new Employee("Иван Иванов", "Разработчик", 150000.0));
        employeeMap.put(102, new Employee("Андрей Андреев", "Дизайнер", 120000.0));
        employeeMap.put(103, new Employee("Петр Петров", "Аналитик", 135000.0));

        System.out.println("Всего сотрудников: " + employeeMap.size());

        int searchId = 102;
        if (employeeMap.containsKey(searchId)) {
            System.out.println("Найден сотрудник с ID " + searchId + ": " + employeeMap.get(searchId));
        } else {
            System.out.println("Сотрудник с ID " + searchId + " не найден.");
        }

        int idToRemove = 103;
        System.out.println("Удаление сотрудника с ID: " + idToRemove);
        employeeMap.remove(idToRemove);

        System.out.println("Текущее количество сотрудников: " + employeeMap.size());
    }
}