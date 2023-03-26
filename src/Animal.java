public abstract class  Animal {
    private String name;
    private int age;
    private char pol;
    private int ves;

    public Animal(String name, int age, char pol, int ves) {
        this.name = name;
        this.age = age;
        this.pol = pol;
        this.ves = ves;

    }

    public Animal() {
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

    public char getPol() {
        return pol;
    }

    public void setPol(char pol) {
        this.pol = pol;
    }

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        this.ves = ves;
    }

    @Override
    public String toString() {
        return "Abstraksiya{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pol=" + pol +
                ", ves=" + ves +
                '}';
    }
}
