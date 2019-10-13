public class Tesla extends Car {
    private Colors.Color color;
    private String typeOfBox;
    private String model;
    private int capacity;

    public Colors.Color getColor() {
        return color;
    }

    public void setColor(Colors.Color color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getTypeOfBox() {
        return typeOfBox;
    }

    @Override
    public void setTypeOfBox(String typeOfBox) {
        this.typeOfBox = typeOfBox;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void accelerate() {
        System.out.println("0 to 100 km/h in 3.2 seconds");
    }

    public void speed() {
        System.out.println("The car gearbox is automatic");
    }

    public void speed(int gear) {
        System.out.println("The car is on gear " + gear);
    }

}
