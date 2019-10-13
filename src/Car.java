public class Car implements Acceleration {
    private Colors.Color color;
    private String typeOfBox;
    private String model;
    private int capacity;

    public Car() {}

    public void accelerate() {
        System.out.println("Acceleration of the car");
    }

    void speed() {
        System.out.println("The car box is automatic");
    }

    void speed(int gear) {
        System.out.println("The car is on gear " + gear);
    }

    public Colors.Color getColor() {
        return color;
    }

    public void setColor(Colors.Color color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypeOfBox() {
        return typeOfBox;
    }

    public void setTypeOfBox(String typeOfBox) {
        this.typeOfBox = typeOfBox;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void checkAvailableSpace(int passengers) {
        if (capacity < passengers) {
            throw new ArrayIndexOutOfBoundsException("Not enough space");
        }
        System.out.println("There is enough space");
    }

}

