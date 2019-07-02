package CH01_Nested;

public class ClassWithLocalInnerClass {

    public static void main(String[] args) {
        System.out.println();
        runProcess("Irish Setter", 1);
        runProcess("Corgi", 7);
    }

    private static void runProcess(String breed, int puppyCount) {

        class Puppies {
            String suffix = null;

            Puppies() {
                if (puppyCount > 1) {
                    suffix = "s.";
                }
                else {
                    suffix = null;
                }

            }
            public String getSuffix() {
                return suffix;
            }

            public String getBreed() {
                return breed;
            }
        }

        Puppies myPuppies = new Puppies();

        if (myPuppies.getSuffix() == null) {
            System.out.println("0 or 1 " + myPuppies.getBreed() + ".");
        }
        else {
            System.out.println("2 or more " + myPuppies.getBreed() +
                    myPuppies.getSuffix());
        }
    }
}
