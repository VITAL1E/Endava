import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int manAge = 25;
        Integer womanAge = 23;

        Car audi = new Audi();
        Car tesla = new Tesla();
        Car porsche = new Porsche();
        Car mercedes = new Mercedes();

        Man man = new Driver("Ion", manAge);
        Man woman = new Passengers("Ioana", womanAge);

        System.out.println(man == woman);
        System.out.println(man.equals(woman));

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

