package CH01_Nested;

public class AnonymousInner {

    interface Spice {
        void dash();
        void pinch(String herb);
    }

    public void addSpices() {
        class Herb implements Spice {
            String spiceName = "garlic";
            public void dash() {
                System.out.println("Added a dash of " + spiceName);
            }
            public void pinch(String theSpice) {
                spiceName = theSpice;
                System.out.println("Added a pinch of " + spiceName);
            }
        }

        Spice basilSpice = new Herb();

        Spice oreganoSpice = new Spice() {
            String spiceName = "oregano";
            public void dash() {
                System.out.println("Added a dash of " + spiceName);
            }
            public void pinch(String theSpice) {
                spiceName = theSpice;
                System.out.println("Added a pinch of " + spiceName);
            }
        };

        Spice rosemarySpice = new Spice() {
            String spiceName = "rosemary";
            public void dash() {
                System.out.println("Added a dash of " + spiceName);
            }
            public void pinch(String theSpice) {
                spiceName = theSpice;
                System.out.println("Added a pinch of " + spiceName);
            }
        };

        basilSpice.dash();
        oreganoSpice.pinch("extra oregano");
        rosemarySpice.dash();
    }

    public static void main(String[] args) {
        AnonymousInner myAnonymous = new AnonymousInner();
        System.out.println("\nRecipe Steps");
        myAnonymous.addSpices();
    }
}
