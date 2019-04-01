package domain;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return(name);
    }

    public int getPosition() {
        return(position);
    }

}
