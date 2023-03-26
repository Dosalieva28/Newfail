public class Cow extends Animal {
    public Cow(String name, int age, char pol, int ves) {
        super(name, age, pol, ves);
    }

    public Cow() {
    }

    @Override
    public String toString() {
        return "Cow{} " + super.toString();
    }
}
