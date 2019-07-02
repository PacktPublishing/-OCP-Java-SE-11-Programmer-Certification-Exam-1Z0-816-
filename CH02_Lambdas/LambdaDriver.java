package CH02_Lambdas;

public class LambdaDriver {

    public static void main(String[] args) {

        // lambda expression
        LambdaDemo bmi =
                (int heightFeet, int heightInches, int weight)
                        -> { System.out.println("\nYour BMI is:");
                        double rawResults = ((703 * weight) /
                                (Math.pow(((heightFeet * 12) + heightInches), 2)));
                        int results = (int)rawResults;
                    System.out.println(results + " %");
                };

        // call the lambda
        bmi.calculateBMI(6, 7, 215);
    }
}
