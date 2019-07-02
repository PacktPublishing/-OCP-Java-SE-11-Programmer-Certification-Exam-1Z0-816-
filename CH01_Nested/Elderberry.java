package CH01_Nested;

public class Elderberry {

    // this is the outer class

    static class Fig {

        // this is a static nested class
    }

    // instantiating a static nested object
    Elderberry.Fig myObject = new Elderberry.Fig();

    class Grapes {

        // this nested class is non-static
        // and is referred to as an inner class
    }

    // instantiating an inner class
    Elderberry.Grapes anotherObject = new Elderberry.Grapes();

}
