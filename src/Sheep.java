public class Sheep extends Animal{
    public Sheep(String name, int age, char pol, int ves) {
        super(name, age, pol, ves);
    }

    public Sheep() {
    }

    @Override
    public String toString() {
        return "Sheep{} " + super.toString();
    }
}
