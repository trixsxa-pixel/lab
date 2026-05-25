import java.util.regex.*;

public class CaseSwapper {
    public static void main(String[] args) {
        String text = "text foR tEst progRam";
        Pattern pattern = Pattern.compile("([a-z][A-Z])");
        Matcher matcher = pattern.matcher(text);
        String result = matcher.replaceAll("!$1!");

        System.out.println(result);
    }
}