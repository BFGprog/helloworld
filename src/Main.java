public class Main {
    public static void main(String[] args) {

        // Задача 1
        // int, byte, short, long, float, double
        int one = 1;
        byte two = 2;
        short tree = 3;
        long four = 4L;
        float five = 5.0f;
        double six = 6;
        System.out.println(one + "\n" + two + "\n" + tree + "\n" + four  + "\n" + five + "\n" + six + "\n");

        // Задача 2
        float seven = 27.12f;
        long eight = 987678965549L;
        double nine = 2.786;
        short ten = 569;
        short eleven = -159;
        int twelve = 27897;
        byte thirteen = 67;

        // Задача 3
        byte classOne = 23;
        byte classTwo = 27;
        byte classTree = 30;
        short paper = 480;
        int forOneStudent = paper / (classOne + classTwo + classTree);

        System.out.println("На каждого ученика рассчитано " + forOneStudent + " листов бумаги");
        System.out.println("\n");
        // Задача 4
        //за 20 минут,
        //в сутки,
        //за 3 дня,
        //за 1 месяц?
        byte inOneMinute = 16 / 2;
        int in20Minute = 20 * inOneMinute;
        int in1Day = 24 * 60 * inOneMinute;
        int in3Days = 3 * 24 * 60 * inOneMinute;
        int in1Month = 30 * 24 * 60 * inOneMinute;

        System.out.println("За 20 минут машина произвела " + in20Minute + " штук бутылок" + "\n" +
                "За сутки машина произвела " + in1Day + " штук бутылок" + "\n" +
                "За 3 дня машина произвела " + in3Days +" штук бутылок" + "\n" +
                "За 1 месяц машина произвела " + in1Month + " штук бутылок" + "\n");

        // Задача 5
        byte allBanks = 120;
        byte forOneClass = 2 + 4;
        int allClass = allBanks / forOneClass;
        int needWhite = allClass * 2;
        int needBrown = allClass * 4;
        System.out.println("В школе, где " + allClass + " классов, нужно " +needWhite + " банок белой краски и " + needBrown + " банок коричневой краски" + "\n");

        // Задача 6
        // Бананы — 5 штук (1 банан — 80 грамм).
        // Молоко — 200 мл (100 мл = 105 грамм).
        // Мороженое-пломбир — 2 брикета по 100 грамм.
        // Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        short bananas = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short egg = 4 * 70;
        int breakfastGram = bananas + milk + iceCream + egg;
        double breakfastKilogram = breakfastGram / 1000.0;
        System.out.println(breakfastKilogram + "\n");


        // Задача 7
        short excessWeight = 7000;
        short minWeightLost = 250;
        short maxWeightLost = 500;
        int minDays = excessWeight / minWeightLost;
        int maxDays = excessWeight / maxWeightLost;
        System.out.println(minDays + "\n" + maxDays + "\n");


        // Задача 8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;

        int masha100 = masha * 100;
        int denis100 = denis * 100;
        int kristina100 = kristina * 100;

        int masha110 = masha100 * 11;
        int denis110 = denis100 * 11;
        int kristina110 = kristina100 * 11;


        int masha10 = masha110 / 1000;
        int denis10 = denis110 / 1000;
        int kristina10 = kristina110 / 1000;

        int mashaYear = masha10 * 12 - masha * 12;
        int denisYear = denis10 * 12 - denis * 12;
        int kristinaYear = kristina10 * 12 - kristina * 12;

        System.out.println("Маша теперь получает " + masha10 + " рублей. Годовой доход вырос на " + mashaYear + " рублей" + "\n" +
                "Денис теперь получает " + denis10 + " рублей. Годовой доход вырос на " + denisYear + " рублей" + "\n" +
                "Кристина теперь получает " + kristina10 + " рублей. Годовой доход вырос на " + kristinaYear + " рублей" + "\n");





    }
}