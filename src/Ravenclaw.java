public class Ravenclaw extends Hogwarts {

//    private String name;
//    private int witchcraftOneHundredPoints;
//    private int transgressToDistanceOfOneHundredKilometers;


    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public Ravenclaw(
//            String name, int witchcraftOneHundredPoints, int transgressToDistanceOfOneHundredKilometers,
            int smart, int wise, int witty, int fullOfCreativity) {

//        this.name = name;
//        this.witchcraftOneHundredPoints = witchcraftOneHundredPoints;
//        this.transgressToDistanceOfOneHundredKilometers = transgressToDistanceOfOneHundredKilometers;
        super(name, witchcraftOneHundredPoints, transgressToDistanceOfOneHundredKilometers);

        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
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

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }

//    @Override
//    public String toString() {
//        return "Ravenclaw{" +
//                "name='" + name + '\'' +
//                ", witchcraftOneHundredPoints=" + witchcraftOneHundredPoints +
//                ", transgressToDistanceOfOneHundredKilometers=" + transgressToDistanceOfOneHundredKilometers +
//                ", smart=" + smart +
//                ", wise=" + wise +
//                ", witty=" + witty +
//                ", fullOfCreativity=" + fullOfCreativity +
//                '}';
//    }
}

