public class Cow extends AbstractDomAnimals{
    public Cow(String name, int weight, int age, String gender) {
        super(name, weight, age, gender);
    }

    @Override
    public String getNickName() {
        return super.getNickName();
    }

    @Override
    public String voice() {
        return getNickName() + " makes sound muu-muu";
    }
}
