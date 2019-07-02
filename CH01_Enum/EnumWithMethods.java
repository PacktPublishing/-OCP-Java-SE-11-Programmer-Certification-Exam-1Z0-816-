package CH01_Enum;

public class EnumWithMethods {

    enum Season {
        AUTUMN, SPRING, SUMMER, WINTER;

        // constructor
        private Season() {
            System.out.println(this.toString() +
                    " - constructor executed.");
        }

        // concrete method
        public void seasonLength() {
            if (this.toString() == "AUTUMN") {
                System.out.println("Autumn is marked by the Southward Equinox.");
            }
            else if (this.toString() == "SPRING") {
                System.out.println("Spring is marked by the Northward Equinox.");
            }
            else if (this.toString() == "SUMMER") {
                System.out.println("Summer is marked by the North Solstice.");
            }
            else if (this.toString() == "WINTER") {
                System.out.println("Winter is marked by the South Solstice.");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println();
        Season theSeason = Season.SPRING;

        System.out.println();
        theSeason.seasonLength();
    }
}
