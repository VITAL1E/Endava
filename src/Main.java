public class Main {
    public static void main(String[] args) {
        int driverAge = 25;
        Integer passengerAge = 23;

        Car audi = new Audi();
        Car tesla = new Tesla();
        Car porsche = new Porsche();
        Car mercedes = new Mercedes();

        Man driver = new Driver("Ion", driverAge);
        Man passenger = new Passengers("Ioana", passengerAge);

        StringBuilder car = new StringBuilder();
        car.append(tesla);

        StringBuffer man = new StringBuffer();
        man.append(passenger);
        man.append(driver);

        System.out.println(driver == passenger);
        System.out.println(driver.equals(passenger));

        System.out.println(audi == mercedes);
        System.out.println(audi.equals(mercedes));

        tesla.setCapacity(4);
        tesla.setModel("Model S");
        tesla.setTypeOfBox("Automatic");
        tesla.setColor(Colors.Color.RED);

        System.out.println("Tesla color is " + tesla.getColor());
        System.out.println("Tesla model is " + tesla.getModel());
        System.out.println("Tesla gearbox is " + tesla.getTypeOfBox());
        System.out.println("Tesla capacity is " + tesla.getCapacity());

        try {
            tesla.accelerate();
            tesla.speed();
            tesla.checkAvailableSpace(2);

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}

