import java.util.regex.*;

public class PasswordChecker {
    public static void main(String[] args) {
        String password = "Password123";

        try {
            String regex = "^(?=.*[0-9])(?=.*[A-Z])[A-Za-z0-9]{8,16}$";

            if (Pattern.matches(regex, password)) {
                System.out.println("Пароль корректен");
            } else {
                System.out.println("Пароль не подходит");
            }
        } catch (PatternSyntaxException e) {
            System.out.println("Ошибка в синтаксисе регулярного выражения.");
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}