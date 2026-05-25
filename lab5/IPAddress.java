import java.util.regex.*;

public class IPAddress {
    public static void main(String[] args) {
        String ip = "192.168.1.30";

        try {
            String b = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
            String regex = "^" + b + "\\." + b + "\\." + b + "\\." + b + "$";

            if (Pattern.matches(regex, ip)) {
                System.out.println("IP-адрес корректен");
            } else {
                System.out.println("Некорректный IP");
            }
        } catch (Exception e) {
            System.out.println("Ошибка" + e.getMessage());
        }
    }
}