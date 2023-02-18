public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int apple = 50000;
        System.out.println("Значение переменной  apple  c типом  int  равно " + apple);
        byte boss = 55;
        System.out.println("Значение переменной  boss  c типом  byte  равно " + boss);
        short cat = 777;
        System.out.println("Значение переменной  cat  c типом  short  равно " + cat);
        long dog = 3000L;
        System.out.println("Значение переменной  dog  c типом  long  равно " + dog);
        float earth = 4.88f;
        System.out.println("Значение переменной  earth  c типом  float  равно " + earth);
        double jungle = 1000;
        System.out.println("Значение переменной  jungle  c типом  double  равно " + jungle);
    }

    public static void task2() {
        System.out.println("Задача 2");
        System.out.println("double a = 27.12");
        System.out.println("long b = 987678965549L");
        System.out.println("float c = 2.786f");
        System.out.println("int d = 569");
        System.out.println("short i = -159");
        System.out.println("int f = 27897");
        System.out.println("byte j = 67");
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte lyda = 23;
        byte anna = 27;
        byte katy = 30;
        short vsego = 480;
        byte itog = (byte) (vsego / (lyda + anna + katy));
        System.out.println("На каждого ученика рассчитано " + itog + " листов бумаги");

    }

    public static void task4() {
        System.out.println("Задача 4");
        byte bytylkaMinuta = 16 / 2;
        int bytylka20Minyt = 20 * bytylkaMinuta;
        System.out.println("За 20 минут машина произвела " + bytylka20Minyt + " штук бутылок");
        short bytylkaSutki = (short) (24 * 60 * bytylkaMinuta);
        System.out.println("За сутки машина произвела " + bytylkaSutki + " штук бутылок");
        long bytylka3day = 3 * bytylkaSutki;
        System.out.println("За три дня машина произвела " + bytylka3day + " штук бутылок");
        long bytylkaMonth = 31 * bytylkaSutki;
        System.out.println("За месяц машина произвела " + bytylkaMonth + " штук бутылок");

    }

    public static void task5() {
        System.out.println("Задача 5");
        int totalCans = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int totalclasses = 120 / (whitePaint + brownPaint);
        byte classWhite = (byte) (totalclasses * 2);
        int classBrown = totalclasses * 4;
        System.out.println(" В школе где " + totalclasses + " классов, нужно " + classWhite + " банок белой  краски и " + classBrown + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
    byte oneBanan = 80;
    short milk = 105;
    byte iceCream = 100;
    byte rawEggs = 70;
    int  weightInGrams = (int) ((5 *  oneBanan) + (2 * milk) + (2 * iceCream ) + (4 * rawEggs));
    int perGrKg = 1000;
    float weightInKg =  weightInGrams / (float)perGrKg;
        System.out.println("Вес завтрака в граммах равен " + weightInGrams +  ", в килограммах " + weightInKg );
    }
    public static void task7() {
        System.out.println("Задача 7");
        short loseWeight = 7;
        float rationOne = 0.25f;
        float rationTwo = 0.5f;
        byte eatOne = (byte) (loseWeight/rationOne);
        byte eatTwo = (byte) (loseWeight / rationTwo);
        float averageRation =  (rationOne + rationTwo) / 2;
        double eat = loseWeight/averageRation;
        System.out.println("Если спортсмен будет питаться по первому рациону (потеря в весе около 250 грамм в день) " +
                "то похудеет за  " + eatOne + " дней, если питаться по второму рациону (потеря в весе около 500 грамм " +
                "в день) то похудеет за  " + eatTwo + " , в среднем может потребоваться " + eat + " дней " );
    }
    public static void task8() {
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKris = 76230;
        float increaseMasha = (float) (salaryMasha * 0.1);
        int generalMasha = (int) (increaseMasha + salaryMasha);
        int masha = (int) (12 * increaseMasha);
        System.out.println("Маша теперь получает " + generalMasha +  " рублей. Годовой доход вырос на " + masha + " рублей ");
        float increaseDenis = (float) (salaryDenis * 0.1);
        int generalDenis = (int) (increaseDenis + salaryDenis);
        int denis = (int) (12 * increaseDenis);
        System.out.println("Денис теперь получает " + generalDenis +  " рублей. Годовой доход вырос на " + denis + " рублей ");
        float increaseKris = (float) (salaryKris * 0.1);
        int generalKris = (int) (increaseKris + salaryKris);
        int kris = (int) (12 * increaseKris);
        System.out.println("Кристина теперь получает " + generalKris +  " рублей. Годовой доход вырос на " + kris + " рублей ");


    }



}
