package CH02_Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFilterExample {

    public static void main(String[] args) {

        System.out.println("\nJersey Numbers Retired by the L.A. Lakers Basketball Team\n");
        List<Integer> jerseyNumbers =
                Arrays.asList
                        (8, 13, 22, 24, 25, 32, 32, 33, 34, 42, 44, 52);

        // Filter Jersey Numbers - Less Than 30
        List<Integer> lessThan30 = jerseyNumbers.stream()
                .filter(jersey -> jersey < 30)
                .collect(Collectors.toList());

        // Filter Jersey Numbers - <= Than 30
        List<Integer> greaterThan29 = jerseyNumbers.stream()
                .filter(jersey -> jersey >= 30)
                .collect(Collectors.toList());

        System.out.println("Jersey Numbers < 30:\n " + lessThan30);
        System.out.println("\nJersey Numbers >= 30:\n " + greaterThan29);
        System.out.println("\nAll Retired Jersey Numbers:\n" + jerseyNumbers);
    }
}
