public class Driver extends Man {
    private String name;
    private int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void walk() {
        System.out.println("Driver can walk");
    }

    public void eat() {
        System.out.println("Driver can eat");
    }
}

