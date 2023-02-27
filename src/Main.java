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

    public static void task1 () {
        System.out.println("Задача 1");
        int accumulation = 0;
        int contribution = 15000;
        int month = 0;
        while (accumulation <= 2459000) {
            accumulation = accumulation + contribution;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + accumulation + " рублей");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int i = 1;
        while (i < 10){
            System.out.print(i + " ");
            i++;
        }
        int f = 10;
        System.out.println(f);
        for (; f > 0; f--){
            System.out.print(f + " ");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int fertility = 17;
        int mortality = 8;
        int population = 12_000_000;
        int difference = fertility - mortality;
        int year = 1;
        for (; year <= 10; year++) {
            population = population + population / 1000 * difference;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deposit = 15000;
        int month = 0;
        while (deposit <= 12_000_000){
            deposit = deposit + deposit / 100 * 7;
            month++;
            System.out.println("Месяц " + month + ", сумма накплений " + deposit);
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int deposit = 15000;
        int month = 0;
        while (deposit <= 12_000_000) {
            deposit = deposit + deposit / 100 * 7;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накплений " + deposit);
            }
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int deposit = 15000;
        int month = 0;
        int years = 9;
        int months = years * 12;
        do {
            deposit = deposit + deposit / 100 * 7;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накплений " + deposit);
            }
        }
        while (month <= months) ;
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int friday = 3;
        do {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        }
        while (friday <= 31);
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int year = 2023;
        int startYear = year - 200;
        int endYear = year + 100;
        while (startYear != endYear){
            if ((startYear - year) % 79 == 0){
                System.out.println(startYear);
            }
            startYear++;
        }
    }
}