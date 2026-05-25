import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

class CustomUnsupportedOperationException extends Exception {
    public CustomUnsupportedOperationException(String message) {
        super(message);
    }
}

public class MathCalculator {

    public static void logException(Exception e) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("math_errors.txt", true))) {
            writer.println(LocalDateTime.now() + " | Исключение: " + e.getClass().getSimpleName());
            writer.println("Детали: " + e.getMessage());
            writer.println("--------------------------------------------------");
        } catch (IOException ioEx) {
            System.out.println("Критическая ошибка логгирования!");
        }
    }

    public static double calculate(double a, double b, String operation) throws CustomUnsupportedOperationException {
        switch (operation) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/":
                if (b == 0) throw new CustomUnsupportedOperationException("Деление на ноль запрещено.");
                return a / b;
            default:
                throw new CustomUnsupportedOperationException("Операция '" + operation + "' не поддерживается.");
        }
    }

    public static void main(String[] args) {
        try {
            double result = calculate(10, 0, "/");
            System.out.println("Результат: " + result);
        } catch (CustomUnsupportedOperationException e) {
            System.out.println("Ошибка калькулятора: " + e.getMessage());
            logException(e);
            System.out.println("Информация сохранена в лог.");
        }
    }
}