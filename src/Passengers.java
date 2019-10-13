public class Passengers extends Man {
    private String name;
    private int age;

    public Passengers(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void walk() {
        System.out.println("Passenger can walk");
    }

    public void eat() {
        System.out.println("Passenger can eat");
    }
}