public class Horse extends Animal{
    private String color;
    public Horse(String name, int age, char pol, int ves) {
        super(name, age, pol, ves);
    }

    public Horse() {
    }

    @Override
    public String toString() {
        return "Horse{} " + super.toString();
    }
}
