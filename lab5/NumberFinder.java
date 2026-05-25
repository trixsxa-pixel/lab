import java.util.regex.*;

public class NumberFinder {
    public static void main(String[] args) {
        String text = "The price is 19.99, the discount is 5, final: 14.99";

        try {
            if (text == null) throw new Exception("Текст отсутствует");

            Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                System.out.println("Найдено число: " + matcher.group());
            }
        } catch (Exception e) {
            System.out.println("Ошибка при поиске чисел: " + e.getMessage());
        }
    }
}