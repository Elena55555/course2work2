public class Gryffindor extends Hogwarts{

//    private String name;
//    private int witchcraftOneHundredPoints;
//    private int transgressToDistanceOfOneHundredKilometers;


    private int nobility;
    private int honor;
    private int bravery;


    public Gryffindor(
//            String name, int witchcraftOneHundredPoints, int transgressToDistanceOfOneHundredKilometers,
            int nobility, int honor, int bravery) {


//        this.name = name;
//        this.witchcraftOneHundredPoints = witchcraftOneHundredPoints;
//        this.transgressToDistanceOfOneHundredKilometers = transgressToDistanceOfOneHundredKilometers;
        super(name, witchcraftOneHundredPoints, transgressToDistanceOfOneHundredKilometers);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
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

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}

