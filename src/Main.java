
public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание № 2 (2 курс) " );

        Hogwarts [] hogwarts   = {
                new Hogwarts(" Гарри Поттер ", 100, 100),
                new Hogwarts(" Гермиона Грейнджер ", 70, 80),
                new Hogwarts(" Рон Уизли ", 20, 80),
                new Hogwarts("Чжоу Чанг", 100, 90),
                new Hogwarts("Падма Патил", 80, 70),
                new Hogwarts("Маркус Белби", 90, 50),
                new Hogwarts("Чжоу Чанг", 100, 90),
                new Hogwarts("Падма Патил", 80, 70),
                new Hogwarts("Маркус Белби", 90, 50),
                new Hogwarts("Драко Малфой", 100, 100),
                new Hogwarts("Грэхэм Монтегю", 100, 80),
                new Hogwarts("Грегори Гойл", 20, 100),
        };

        System.out.println("размер списка " + hogwarts.length);
        for (int i = 0; i< hogwarts.length; i++) {
            Hogwarts hogwart   = hogwarts[i];
            System.out.println("Имя " +    hogwart.getName()   +
                    ", умение колдовать =" + hogwart.getWitchcraftOneHundredPoints() +
                    ",  умение трасгрессировать на расстояние =" + hogwart.getTransgressToDistanceOfOneHundredKilometers() +
                    '}' );


        }











        Gryffindor [] gryffindors  = {
                new Gryffindor(" Гарри Поттер ", 100, 100, 100, 100, 100),
                new Gryffindor(" Гермиона Грейнджер ", 70, 80, 50, 10, 70),
                new Gryffindor(" Рон Уизли ", 20, 80, 50, 10, 90),

        };

//        System.out.println(" Размер списка " + gryffindors.length);
//
//        for (int i = 0; i< gryffindors.length; i++) {
//            Gryffindor gryffindor  = gryffindors[i];
//
//            System.out.println(" Имя = " + gryffindor.getName() + ",  уменение колдовать = "+ gryffindor.getWitchcraftOneHundredPoints() +
//                    ",  умение трансгрессировать =  " + gryffindor.getTransgressToDistanceOfOneHundredKilometers() + ",  благородство = " +
//                    gryffindor.getNobility() + ",  честь = " + gryffindor.getHonor() + ",  храбрость = " + gryffindor.getBravery());
//
//
//        }


//        System.out.println("Метод, выводящий результат суммы балов 2 - ух учеников факультета  Griffindor ");
//        int sumScoresGriffindor = 0;
//        for (int i = 0; i < gryffindors.length - 1; i++) {
//            Gryffindor gryffindor = gryffindors[i];
//            sumScoresGriffindor =  gryffindor.getWitchcraftOneHundredPoints() + gryffindor.getTransgressToDistanceOfOneHundredKilometers() +
//                    gryffindor.getNobility() + gryffindor.getHonor() + gryffindor.getBravery();
//            System.out.println(sumScoresGriffindor);
//
//        }
//
//        System.out.println("Гарри Поттер  лучший Гриффиндорец, чем  Гермиона Грейнджер ");






        Hufflepuff [] hufflepuffs = new Hufflepuff[3];
        hufflepuffs[0]= new Hufflepuff(" Захария Смит ", 100,22, 66, 77, 77);
        hufflepuffs [1] = new Hufflepuff(" Седрик Диггори ", 22, 33, 50, 70, 20);
        hufflepuffs [2] = new Hufflepuff(" Джастин Финч-Флетчли ", 10, 20, 40, 20, 100);


//        System.out.println(" Размер списка " + hufflepuffs .length);
//        for (int i = 0; i< hufflepuffs .length; i++) {
//            Hufflepuff hufflepuff = hufflepuffs[i];
//            System.out.println( " Имя " + hufflepuff.getName() + ",  умение колдовать = " + hufflepuff.getWitchcraftOneHundredPoints() +
//                    ",  умение трансгрессировать = " + hufflepuff.getTransgressToDistanceOfOneHundredKilometers()   +
//                    ",  трудолюбие = " + hufflepuff.getHardworking()  +
//                    ",  верность = " + hufflepuff.getLoyal() +
//                    ", честность = " + hufflepuff.getHonest());
//
//
//        }




//        int sumScoresHufflepuff  = 0;
//        for (int i = 0; i < hufflepuffs.length-1; i++) {
//            Hufflepuff hufflepuff = hufflepuffs[i];
//            sumScoresHufflepuff  =  hufflepuff.getWitchcraftOneHundredPoints() +
//                      hufflepuff.getTransgressToDistanceOfOneHundredKilometers()   +
//                      hufflepuff.getHardworking()  +
//                      hufflepuff.getLoyal() +
//                      hufflepuff.getHonest()  ;
//            System.out.println(sumScoresHufflepuff );
//        }
//        System.out.println( " Захария Смит лучшая студентка Пуффендуй, чем Седрик Диггори ");



        Ravenclaw []  ravenclaws = new Ravenclaw[3];
        ravenclaws [0]=new Ravenclaw("Чжоу Чанг", 100, 90, 30, 70, 45, 90);
        ravenclaws [1]=new Ravenclaw("Падма Патил", 80, 70, 40, 50, 45, 80);
        ravenclaws [2]=new Ravenclaw("Маркус Белби", 90, 50, 70, 80, 45, 100);


//        System.out.println(" Размер списка " + ravenclaws.length);
//        for (int i = 0; i< ravenclaws.length; i++) {
//            Ravenclaw ravenclaw = ravenclaws[i];
//            System.out.println(" Имя " + ravenclaw.getName() +
//                    ",  умение колдовать = " + ravenclaw.getWitchcraftOneHundredPoints() +
//                    ",  умение  трансгрессировать = " + ravenclaw.getTransgressToDistanceOfOneHundredKilometers()  +
//                    ", ум = " + ravenclaw.getSmart()  +
//                    ", мудрость = " + ravenclaw.getWise()  +
//                    ", остроумие = " + ravenclaw.getWitty()  +
//                    ", творчество = " + ravenclaw.getFullOfCreativity() );
//
//        }

//        int sumScoresRavenclaw = 0;
//        for (int i = 0; i < ravenclaws.length-1; i++) {
//            Ravenclaw ravenclaw = ravenclaws[i];
//            sumScoresRavenclaw =  ravenclaw.getWitchcraftOneHundredPoints()   + ravenclaw.getTransgressToDistanceOfOneHundredKilometers()  +
//                    ravenclaw.getSmart()  +  ravenclaw.getWise()  +  ravenclaw.getWitty()  + ravenclaw.getFullOfCreativity();
//            System.out.println(sumScoresRavenclaw);
//
//        }
//        System.out.println(" Чжоу Чанг  лучший студент Когтеврана, чем Падма Патил");


        Slytherin [] slytherins = new Slytherin[3];
        slytherins [0] = new Slytherin("Драко Малфой", 100, 100, 100, 100, 100, 100, 100);
        slytherins [1] = new Slytherin("Грэхэм Монтегю", 100, 80, 80, 50, 100, 80, 50);
        slytherins [2] = new Slytherin("Грегори Гойл", 20, 100, 50, 20, 80, 90, 70);

//        System.out.println("размер списка " + slytherins.length);
//        for (int i = 0; i< slytherins.length; i++) {
//            Slytherin slytherin = slytherins[i];
//            System.out.println(" Имя " + slytherin.getName() + ", умение колдовать = " +
//                    slytherin.getWitchcraftOneHundredPoints()  +
//                    ",  умение трансгрессировать = "  + slytherin.getTransgressToDistanceOfOneHundredKilometers() +
//                    ",  хитрость = " + slytherin.getCunning() +
//                    ",  решительность = " + slytherin.getDetermination()  +
//                    ", амбициозность = " + slytherin.getAmbition()  +
//                    ",  находчивость = " + slytherin.getResourcefulness()  +
//                    ",  жажда власти = " + slytherin.getThirstForPower()  +
//                    '}'  );
//        }
//
//        int sumScoresSlitherin = 0;
//        for (int i = 0; i < slytherins.length-1; i++) {
//            Slytherin slytherin = slytherins[i];
//            sumScoresSlitherin = slytherin.getWitchcraftOneHundredPoints()  +
//                     slytherin.getTransgressToDistanceOfOneHundredKilometers() +
//                     slytherin.getCunning() +
//                      slytherin.getDetermination()  +
//                      slytherin.getAmbition()  +
//                      slytherin.getResourcefulness()  +
//                     slytherin.getThirstForPower()  ;
//            System.out.println(sumScoresSlitherin );
//
//
//        }
//        System.out.println("Драко Малфой лучший студент Слизерина, чем Грэхэм Монтегю");




//        System.out.println( "Сравнение по признаку силы магии двух первых студентов в Гриффиндоре ");
//        int max = 0;
//        String names = null;
//        for (int i = 0; i < gryffindors.length-1 ; i++) {
//            if (max == gryffindors[i].getWitchcraftOneHundredPoints()) {
//                names +=   gryffindors[i].getName();
//            } else if (max < gryffindors[i].getWitchcraftOneHundredPoints()) {
//                max = gryffindors[i].getWitchcraftOneHundredPoints();
//                names = gryffindors[i].getName();
//            }
//        }
//        System.out.println(names);
//
//        System.out.println (" " );
//
//        System.out.println( "Сравнение по признаку расстояния трансгресии двух первых студентов в Гриффиндоре ");
//        int max2 = 0;
//        String names2 = null;
//        for (int i = 0; i < gryffindors.length-1 ; i++) {
//            if (max2 == gryffindors[i].getTransgressToDistanceOfOneHundredKilometers()) {
//                names2 +=   gryffindors[i].getName();
//            } else if (max2 < gryffindors[i].getTransgressToDistanceOfOneHundredKilometers()) {
//                max2 = gryffindors[i].getTransgressToDistanceOfOneHundredKilometers();
//                names2 = gryffindors[i].getName();
//            }
//        }
//        System.out.println(names2);












        PrintService printService = new PrintService();

        printService.print(gryffindors);
        printService.sum(gryffindors);

        printService.print(hufflepuffs);
        printService.sum(hufflepuffs);

        printService.print(ravenclaws);
        printService.sum(ravenclaws);


        printService.print(slytherins);
        printService.sum(slytherins);

        printService.comparisonWitchcraft(gryffindors);
        printService.comparisonTransgress(gryffindors);













        //Hogwarts hogwarts = new Hogwarts();
        //Hogwarts.print ( );

    }
}