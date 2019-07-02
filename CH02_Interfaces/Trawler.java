package CH02_Interfaces;

public class Trawler implements Boat {

    // class variables
    int length = 20;
    int capacity = 6;
    int passengers = 0;

    @Override
    public void changeLength(int inputValue) {
        length = inputValue;
    }

    @Override
    public void changeCapacity(int inputValue) {
        capacity = inputValue;
    }

    @Override
    public void addPassengers(int inputValue) {
        passengers += inputValue;
    }

    @Override
    public void removePassengers(int inputValue) {
        passengers -= inputValue;
    }
}
