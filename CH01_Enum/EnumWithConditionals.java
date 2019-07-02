package CH01_Enum;

public class EnumWithConditionals {

    enum FileMenu {
        OPEN, SAVE, CLOSE, DELETE;
    }

    static FileMenu selection;

    //constructor
    public EnumWithConditionals(FileMenu selection) {
        this.selection = selection;
    }

    public void printUserSelection() {
        if (selection.toString() == FileMenu.CLOSE.toString()) {
            System.out.println("The user selected the "
                    + selection.toString() + " menu option.");
        }
        else {
            System.out.println("The user selected something " +
                    "other than the CLOSE option.");
        }
    }

    public static void main(String[] args) {
        // Pass 1
        EnumWithConditionals menuChoice1 =
                new EnumWithConditionals(selection.valueOf("OPEN"));
        System.out.println("\nPASS ONE");
        menuChoice1.printUserSelection();

        // Pass 2
        EnumWithConditionals menuChoice2 =
                new EnumWithConditionals(selection.valueOf("CLOSE"));
        System.out.println("\nPASS TWO");
        menuChoice2.printUserSelection();
    }
}
