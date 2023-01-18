import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        ArrayList<String> array1;
        ArrayList<String> array2;
        List<String> result;
        if (args.length == 2) {
            array1 = new ArrayList<String>(Arrays.asList(args[0].replace("[","").replace("]","").split(",")));
            array2 = new ArrayList<String>(Arrays.asList(args[1].replace("[","").replace("]","").split(",")));

            System.out.println(array1
                    .stream()
                    .filter(a2 -> array2.stream().anyMatch(a1 -> a1.equals(a2)))
                    .distinct()
                    .collect(Collectors.toList()));
        } else {
            System.out.println("ERROR|Wrong number of arguments, two and only two arrays are required");
        }
    }
}
