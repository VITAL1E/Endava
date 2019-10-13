import java.util.Objects;

public class Man {
    private String name;
    private int age;

    public Man() { }

    public void walk() {
        System.out.println("Man can walk");
    }

    public void eat() {
        System.out.println("Man can eat");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return age == man.age &&
                Objects.equals(name, man.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
