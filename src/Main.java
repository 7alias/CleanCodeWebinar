import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("123");
        strings.add("ASD");
        String stringStream = filterStrings(strings);
        System.out.println(stringStream);

    }

    private static String filterStrings(List<String> strings) {
        return strings.stream()
                /**
                 * good filter:
                 */
                .filter(Objects::nonNull)
                /**
                 * alternative filter:
                 */
                .filter(string -> Objects.nonNull(string))
                .limit(10)
                .filter(string -> !string.equals("123")) //exclude HardCode
                .findAny().orElse(null);


    }
}
