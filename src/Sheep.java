public class Sheep extends AbstractDomAnimals{
    public Sheep(String name, int weight, int age, String gender) {
        super(name, weight, age, gender);
    }

    @Override
    public String getNickName() {
        return super.getNickName();
    }

    @Override
    public String voice() {
        return getNickName() + " makes sound bee-bee";
    }
}
