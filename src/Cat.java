public class Cat extends Animal {

    public Cat(String name, int age, char pol, int ves) {
        super(name, age, pol, ves);
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{} " + super.toString();
    }
}
