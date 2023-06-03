public class Slytherin extends Hogwarts {

//    private String name;
//    private int witchcraftOneHundredPoints;
//    private int transgressToDistanceOfOneHundredKilometers;


    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;


    public Slytherin(
//            String name, int witchcraftOneHundredPoints, int transgressToDistanceOfOneHundredKilometers,
            int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, witchcraftOneHundredPoints, transgressToDistanceOfOneHundredKilometers);
//        this.name = name;
//        this.witchcraftOneHundredPoints = witchcraftOneHundredPoints;
//        this.transgressToDistanceOfOneHundredKilometers = transgressToDistanceOfOneHundredKilometers;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getWitchcraftOneHundredPoints() {
//        return witchcraftOneHundredPoints;
//    }
//
//    public void setWitchcraftOneHundredPoints(int witchcraftOneHundredPoints) {
//        this.witchcraftOneHundredPoints = witchcraftOneHundredPoints;
//    }
//
//    public int getTransgressToDistanceOfOneHundredKilometers() {
//        return transgressToDistanceOfOneHundredKilometers;
//    }
//
//    public void setTransgressToDistanceOfOneHundredKilometers(int transgressToDistanceOfOneHundredKilometers) {
//        this.transgressToDistanceOfOneHundredKilometers = transgressToDistanceOfOneHundredKilometers;
//    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
}

//    @Override
//    public String toString() {
//        return "Slytherin{" +
//                "name='" + name + '\'' +
//                ", witchcraftOneHundredPoints=" + witchcraftOneHundredPoints +
//                ", transgressToDistanceOfOneHundredKilometers=" + transgressToDistanceOfOneHundredKilometers +
//                ", cunning=" + cunning +
//                ", determination=" + determination +
//                ", ambition=" + ambition +
//                ", resourcefulness=" + resourcefulness +
//                ", thirstForPower=" + thirstForPower +
//                '}';
//    }
//}
