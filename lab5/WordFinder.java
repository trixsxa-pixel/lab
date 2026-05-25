import java.util.regex.*;

public class WordFinder {
    public static void main(String[] args) {
        String text = "Apple banana apricot cherry";
        char letter = 'a';

        try {
            String regex = "\\b(?i)" + letter + "\\w*\\b";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            boolean found = false;
            while (matcher.find()) {
                System.out.println("Найдено: " + matcher.group());
                found = true;
            }
            if (!found) System.out.println("Слова на эту букву не найдены.");

        } catch (Exception e) {
            System.out.println("Ошибка поиска слов: " + e.getMessage());
        }
    }
}