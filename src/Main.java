import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AbstractDomAnimals[] animals = {
                new Cow("Sonya", 120, 5, "Female"),
                new Cow("Masha", 150, 4, "Female"),
                new Cow("Borya", 180, 6, "Male"),
                new Cow("Tina", 200, 7, "Female"),
                new Cow("Buran", 170, 3, "Male"),
                new Cow("Joe", 130, 4, "Female"),
                new Sheep("Sarah", 25, 2, "Female"),
                new Sheep("Nusya", 24, 3, "Male"),
                new Sheep("Senya", 22, 1, "Male"),
                new Sheep("Tanya", 21, 2, "Female"),
                new Horse("Strela", 100, 5, "Male", "Grey"),
                new Horse("Blue Star", 80, 4, "Female", "Brown"),
                new Horse("Rock", 90, 3, "Male", "White")
        };

        Cow[] cows = new Cow[6];
        String[] cowsName = new String[6];
        Sheep[] sheeps = new Sheep[4];
        String[] sheepsName = new String[4];
        Horse[] horses = new Horse[3];
        String[] horsesName = new String[3];
        int i = 0, j = 0, k = 0;
        String res = "";
        for (AbstractDomAnimals a: animals) {
            if (a instanceof Cow) {
                cows[i] = (Cow) a;
                cowsName[i] = a.getNickName();
                res = a.voice();
                i++;
            } else if (a instanceof Sheep) {
                sheeps[j] = (Sheep) a;
                sheepsName[j] = a.getNickName();
                res = a.voice();
                j++;
            } else if (a instanceof Horse) {
                horses[k] = (Horse) a;
                horsesName[k] = a.getNickName();
                res = a.voice();
                k++;
            }
            System.out.print(a.getClass().getSimpleName() + " " + a.toString());
            System.out.println(", " + res);
        }

        Farm farm1 = new Farm("Bolotov Tagay", "Bishkek");
        farm1.setSheepNames(Arrays.copyOf(sheepsName,3));
        farm1.setCowNames(Arrays.copyOf(cowsName,5));
        farm1.setHorseNames(Arrays.copyOf(horsesName,2));
        System.out.println("\n" + farm1.getFarm());

        Farm farm2 = new Farm("Asanov Taalay", "Tokmok");
        farm2.setSheepNames(Arrays.copyOfRange(sheepsName,3, 4));
        farm2.setCowNames(Arrays.copyOfRange(cowsName,5, 6));
        farm2.setHorseNames(Arrays.copyOfRange(horsesName,2,3));
        System.out.println(farm2.getFarm());
    }
}