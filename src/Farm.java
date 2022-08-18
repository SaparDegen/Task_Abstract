import java.util.Arrays;

public class Farm {
    private String ownerName;
    private String address;
    private Cow[] cows;
    private String[] cowNames;
    private Horse[] horses;
    private String[] horseNames;
    private Sheep[] sheeps;
    private String[] sheepNames;

    public Farm(String ownerName, String address) {
        this.ownerName = ownerName;
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public String[] getCowNames() {
        return cowNames;
    }

    public void setCowNames(String[] cowNames) {
        this.cowNames = cowNames;
    }

    public String[] getSheepNames() {
        return sheepNames;
    }

    public void setSheepNames(String[] sheepNames) {
        this.sheepNames = sheepNames;
    }

    public String[] getHorseNames() {
        return horseNames;
    }

    public void setHorseNames(String[] horseNames) {
        this.horseNames = horseNames;
    }

    @Override
    public String toString() {
        return "Farm{ownerName='" + ownerName + "', address='" + address + ", sheeps=" + Arrays.toString(sheeps) + "', cows=" + Arrays.toString(cows) + ", horses=" + Arrays.toString(horses) + '}';
    }

    public String getFarm() {
        return "Farm{ownerName='" + ownerName + "', address='" + address + ", sheeps=" + Arrays.toString(sheepNames) + "', cows=" + Arrays.toString(cowNames) + ", horses=" + Arrays.toString(horseNames) + '}';
    }
}
