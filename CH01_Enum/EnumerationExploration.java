package CH01_Enum;

public class EnumerationExploration {

    enum Quarter {
        FIRST, SECOND, THIRD, FOURTH;
    }

    public static void main(String[] args) {
        Quarter q3 = Quarter.THIRD;
        System.out.println("\nIt is the " + q3 + " quarter.");

    }
}
