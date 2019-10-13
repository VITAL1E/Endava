public class Porsche extends Car {
    private Colors.Color color;
    private String typeOfBox;
    private String model;
    private int capacity;

    @Override
    public Colors.Color getColor() {
        return color;
    }

    public void setColor(Colors.Color color) {
        this.color = color;
    }

    @Override
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

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void accelerate() {
        System.out.println("0 to 100 km/h in 3.9 seconds");
    }

    @Override
    public void speed() {
        System.out.println("The car gearbox is automatic");
    }

    @Override
    public void speed(int gear) {
        System.out.println("The car is on gear " + gear);
    }
}
