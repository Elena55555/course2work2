public class Hufflepuff extends Hogwarts  {

//    private String name;
//    private int witchcraftOneHundredPoints;
//    private int transgressToDistanceOfOneHundredKilometers;


    private int hardworking;
    private int  loyal;
    private int   honest;

    public Hufflepuff(
//            String name ,  int witchcraftOneHundredPoints,  int transgressToDistanceOfOneHundredKilometers,
            int hardworking, int loyal, int honest) {

//        this.name = name;
//        this.witchcraftOneHundredPoints = witchcraftOneHundredPoints;
//        this.transgressToDistanceOfOneHundredKilometers = transgressToDistanceOfOneHundredKilometers;
        super(name ,   witchcraftOneHundredPoints,  transgressToDistanceOfOneHundredKilometers);
        this.hardworking =hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

//

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }


//    @Override
//    public String toString() {
//        return "Hufflepuff{" +
//                "name='" + name + '\'' +
//                ", witchcraftOneHundredPoints=" + witchcraftOneHundredPoints +
//                ", transgressToDistanceOfOneHundredKilometers=" + transgressToDistanceOfOneHundredKilometers +
//                ", hardworking=" + hardworking +
//                ", loyal=" + loyal +
//                ", honest=" + honest +
//                '}';
}

