public class Horse extends AbstractDomAnimals{
    private String color;

    public Horse(String name, int weight, int age, String gender, String color) {
        super(name, weight, age, gender);
        this.color = color;
    }

    @Override
    public String getNickName() {
        return super.getNickName();
    }

    @Override
    public String voice() {
        return getNickName() + " makes sound igogo-igogo";
    }

    @Override
    public String toString() {
        return super.toString() + ", color='" + color + "'";
    }
}
